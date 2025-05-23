from config import PACKAGE_NAME, MAX_METHODS_PER_CLASS
from .java_code_generator import JavaCodeGenerator


class WorkerInterface(JavaCodeGenerator):
    @staticmethod
    def generate_method_impl(index: int) -> str:
        return f"""default int extraWork{index}(byte[] data) {{
        return data.length + {index};
    }}"""

    @staticmethod
    def generate_code() -> str:
        return f"""package {PACKAGE_NAME};

public interface Worker {{

    int work(byte[] data);

    {'\n\n\t'.join(map(WorkerInterface.generate_method_impl, range(MAX_METHODS_PER_CLASS)))}

}}"""
