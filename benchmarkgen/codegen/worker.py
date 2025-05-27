import random

from config import MAX_METHODS_PER_CLASS, PACKAGE_NAME
from .java_code_generator import JavaCodeGenerator
from worker_info import WorkerInfo


def generate_inheritance_clause(worker: WorkerInfo) -> str:
    if worker.parent:
        return f"extends Worker{worker.parent.id}"
    else:
        return "extends AbstractWorker implements Worker"

class WorkerImplementation(JavaCodeGenerator):
    def __init__(self, worker_info: WorkerInfo):
        self.info = worker_info

    def generate_basic_methods(self):
        methods = []

        if not self.info.parent or random.random() > 0.5:
            methods.append(f"""    @Override
    public int work(byte[] data) {{
        return data.length + {self.info.id % 20};
    }}""")
            self.info.add_implemented_method("work")

        if not self.info.parent or random.random() > 0.5:
            methods.append(f"""    @Override
    public int abstractWork(byte[] data) {{
        return data.length + {self.info.id % 20};
    }}""")
            self.info.add_implemented_method("abstractWork")

        return methods

    def generate_inherited_methods(self):
        methods = []

        if self.info.parent:
            self.info.implemented_methods |= self.info.parent.implemented_methods

            methods.extend(self.generate_interface_method_overrides())

        methods.extend(self.generate_abstract_implementations())
        methods.extend(self.generate_interface_implementations())

        return methods

    def generate_interface_method_overrides(self):
        interface_methods = {
            f"extraWork{i}" for i in range(MAX_METHODS_PER_CLASS)
            if self.info.parent.implements_method(f"extraWork{i}")
        }

        self.info.implemented_methods |= interface_methods

        return [f"""    @Override
    public int {method}(byte[] data) {{
        return super.{method}(data) + {self.info.id};
    }}""" for method in interface_methods]

    def generate_abstract_implementations(self):
        num_methods = random.randint(1, MAX_METHODS_PER_CLASS)
        method_ids_to_implement = random.sample(range(MAX_METHODS_PER_CLASS), num_methods)
        methods = {f"abstractExtraWork{i}" for i in method_ids_to_implement}

        self.info.implemented_methods |= methods

        return [f"""    @Override
    public int {method}(byte[] data) {{
        return data.length * {self.info.id + i + 42};
    }}""" for i, method in enumerate(methods)]

    def generate_interface_implementations(self):
        num_methods = random.randint(1, MAX_METHODS_PER_CLASS)
        method_ids_to_implement = random.sample(range(MAX_METHODS_PER_CLASS), num_methods)
        methods = {f"extraWork{i}" for i in method_ids_to_implement} - self.info.implemented_methods

        self.info.implemented_methods |= methods

        return [f"""    @Override
    public int {method}(byte[] data) {{
        return data.length * {self.info.id + i + 43};
    }}""" for i, method in enumerate(methods)]

    def generate_unique_methods(self) -> list[str]:
        return [
            f"""    public int uniqueMethod{self.info.id}_{i}(byte[] data) {{
        return data.length * {self.info.id + i};
    }}""" for i in range(self.info.num_unique_methods)]

    def generate_static_work_method(self):
        return f"""    public static int staticWork(byte[] data) {{
        return data.length + {self.info.id * 2 + 1};
    }}"""

    def generate_code(self, line_sep = '\n\n') -> str:
        all_methods = self.generate_basic_methods() + self.generate_inherited_methods() + self.generate_unique_methods() + [self.generate_static_work_method()]

        return f"""package {PACKAGE_NAME};

public class Worker{self.info.id} {generate_inheritance_clause(self.info)} {{

{line_sep.join(all_methods)}

}}"""
