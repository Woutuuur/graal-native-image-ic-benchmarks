import os
import random
from pathlib import Path
from typing import List

from codegen import WorkerInterface, AbstractWorker, WorkerImplementation, DataClass, BenchmarkClass
from config import MAX_INHERITANCE_DEPTH, NUM_WORKERS
from worker_info import WorkerInfo

OUTPUT_DIR = Path("../src/main/java/nl/vu/wouter/complex/")


def write_code_to_file(file_name: str, content: str):
    with open(OUTPUT_DIR / file_name, "w") as f:
        f.write(content)


def setup_inheritance_hierarchy(workers: List[WorkerInfo]):
    workers = list(workers)
    random.shuffle(workers)

    for i, worker in enumerate(workers[1:], 1):
        if random.random() > 0.75:  # 75% chance to have a parent
            continue

        valid_parents = [parent for parent in workers[:i] if parent.depth < MAX_INHERITANCE_DEPTH - 1]
        worker.parent = random.choice(valid_parents)


def create_workers():
    return [WorkerInfo(random.randint(1, 3)) for _ in range(NUM_WORKERS)]


def main():
    random.seed(42)

    os.makedirs(OUTPUT_DIR, exist_ok=True)
    for old_file in OUTPUT_DIR.glob('*.java'):
        old_file.unlink()

    workers = create_workers()
    setup_inheritance_hierarchy(workers)

    print(f"Generating files in {OUTPUT_DIR}")

    write_code_to_file("Worker.java", WorkerInterface.generate_code())
    write_code_to_file("AbstractWorker.java", AbstractWorker.generate_code())

    for worker in workers:
        implementation = WorkerImplementation(worker)
        write_code_to_file(f"Worker{worker.id}.java", implementation.generate_code())

    data_class = DataClass(workers)
    write_code_to_file("Data.java", data_class.generate_code())

    write_code_to_file("ComplexPolymorphicCallsBenchmark.java", BenchmarkClass.generate_code())

    print(f"Generated {NUM_WORKERS} worker classes")


if __name__ == "__main__":
    main()
