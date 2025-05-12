package nl.vu.wouter.polymorphic;

import org.openjdk.jmh.annotations.CompilerControl;

public class Data {

    private static final Worker0 worker0 = new Worker0();
    private static final Worker1 worker1 = new Worker1();
    private static final Worker2 worker2 = new Worker2();

    private final AbstractWorker abstractWorker;
    private final Worker worker;
    private final byte[] data;

    private final byte id;

    private AbstractWorker getAbstractWorker(byte id) {
        return switch (id) {
            case 0 -> worker0;
            case 1 -> worker1;
            case 2 -> worker2;
            default -> throw new IllegalArgumentException("Unknown worker id: " + id);
        };
    }

    private Worker getInterfaceWorker(byte id) {
        return switch (id) {
            case 0 -> worker0;
            case 1 -> worker1;
            case 2 -> worker2;
            default -> throw new IllegalArgumentException("Unknown worker id: " + id);
        };
    }

    public Data(byte id, byte[] data) {
        this.data = data;
        this.abstractWorker = getAbstractWorker(id);
        this.worker = getInterfaceWorker(id);
        this.id = id;
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public int doAbstractWork() {
        return abstractWorker.abstractWork(data);
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public int doInterfaceWork() {
        return worker.work(data);
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public int doStaticWorkBySwitchCase() {
        return switch (id) {
            case 0 -> Worker0.staticWork(data);
            case 1 -> Worker1.staticWork(data);
            case 2 -> Worker2.staticWork(data);
            default -> throw new IllegalArgumentException("Unknown worker id: " + id);
        };
    }

}
