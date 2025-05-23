from config import PACKAGE_NAME, MAX_METHODS_PER_CLASS
from .java_code_generator import JavaCodeGenerator


class AbstractWorker(JavaCodeGenerator):
    @staticmethod
    def generate_method_impl(index: int) -> str:
        return f"""    public int abstractExtraWork{index}(byte[] data) {{
        return data.length * ({index} + 1);
    }}"""

    @staticmethod
    def generate_code() -> str:
        return f"""package {PACKAGE_NAME};

public abstract class AbstractWorker {{

    public abstract int abstractWork(byte[] data);

{'\n\n'.join(map(AbstractWorker.generate_method_impl, range(MAX_METHODS_PER_CLASS)))}

}}"""
