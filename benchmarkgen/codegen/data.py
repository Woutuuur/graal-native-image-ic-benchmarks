from typing import List

from config import PACKAGE_NAME, MAX_METHODS_PER_CLASS
from .java_code_generator import JavaCodeGenerator
from worker_info import WorkerInfo


class DataClass(JavaCodeGenerator):
    def __init__(self, workers: List[WorkerInfo]):
        self.workers = workers

    def generate_worker_instances(self) -> str:
        return '\n\t'.join(f"private static final Worker{w.id} worker{w.id} = new Worker{w.id}();" for w in self.workers)

    def generate_map_entries(self) -> str:
        abstract_entries = '\n\t\t'.join(f"ABSTRACT_WORKERS.put({w.id}, worker{w.id});" for w in self.workers)
        interface_entries = '\n\t\t'.join(f"INTERFACE_WORKERS.put({w.id}, worker{w.id});" for w in self.workers)
        return abstract_entries + '\n\n\t\t' + interface_entries

    def generate_method_calls(self) -> str:
        return '\n\t\t'.join(f"result += worker{w.id}.uniqueMethod{w.id}_{m}(dummyData);"
                         for w in self.workers for m in range(w.num_unique_methods))

    def generate_switch_cases(self) -> str:
        return '\n\t\t\t'.join(f"case {w.id} -> Worker{w.id}.staticWork(data);" for w in self.workers)

    def generate_code(self) -> str:
        work_method_sep = '\n\t\t\t'

        return f"""package {PACKAGE_NAME};

import org.openjdk.jmh.annotations.CompilerControl;
import java.util.HashMap;
import java.util.Map;

public class Data {{

    {self.generate_worker_instances()}

    private final AbstractWorker abstractWorker;
    private final Worker worker;
    private final byte[] data;
    private final int id;

    private static final Map<Integer, AbstractWorker> ABSTRACT_WORKERS = new HashMap<>();
    private static final Map<Integer, Worker> INTERFACE_WORKERS = new HashMap<>();

    static {{
        {self.generate_map_entries()}

        byte[] dummyData = new byte[10];
        int result = 0;

        {self.generate_method_calls()}

        if (result < 0) System.out.println("This should never happen: " + result);  
    }}

    private AbstractWorker getAbstractWorker(int id) {{
        return ABSTRACT_WORKERS.get(id);
    }}

    private Worker getInterfaceWorker(int id) {{
        return INTERFACE_WORKERS.get(id);
    }}

    public Data(int id, byte[] data) {{
        this.data = data;
        this.id = id;
        this.abstractWorker = getAbstractWorker(id);
        this.worker = getInterfaceWorker(id);
    }}

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public int doAbstractWork() {{
        return abstractWorker.abstractWork(data) + switch (this.id % {MAX_METHODS_PER_CLASS}) {{
            {work_method_sep.join(f'case {i} -> abstractWorker.abstractExtraWork{i}(data);' for i in range(MAX_METHODS_PER_CLASS))}
            default -> 0;
        }};
    }}

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public int doInterfaceWork() {{
        return worker.work(data) + switch (this.id % {MAX_METHODS_PER_CLASS}) {{
            {work_method_sep.join(f'case {i} -> worker.extraWork{i}(data);' for i in range(MAX_METHODS_PER_CLASS))}
            default -> 0;
        }};
    }}
       
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public int doStaticWorkBySwitchCase() {{
        return switch (id) {{
            {self.generate_switch_cases()}
            default -> Worker0.staticWork(data);
        }};
    }} 
}}"""
