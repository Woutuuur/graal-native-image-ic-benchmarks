from dataclasses import dataclass, field
from typing import Optional


class WorkerCounter:
    count = 0

    @staticmethod
    def new_id():
        WorkerCounter.count += 1
        return WorkerCounter.count - 1


@dataclass
class WorkerInfo:
    num_unique_methods: int
    parent: Optional["WorkerInfo"] = field(default=None)
    id: int = field(default_factory=WorkerCounter.new_id, init=False)
    implemented_methods: set[str] = field(default_factory=set, init=False)

    @property
    def depth(self):
        return 1 if self.parent is None else self.parent.depth + 1

    def add_implemented_method(self, method_name: str):
        self.implemented_methods.add(method_name)

    def implements_method(self, method_name: str):
        return method_name in self.implemented_methods
