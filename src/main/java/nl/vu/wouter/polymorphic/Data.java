package nl.vu.wouter.polymorphic;

import org.openjdk.jmh.annotations.CompilerControl;

public class Data {

    private static final Worker0 worker0 = new Worker0();
    private static final Worker1 worker1 = new Worker1();
    private static final Worker2 worker2 = new Worker2();

    private final AbstractWorker abstractWorker;
    private final Worker worker;
    private final byte[] data;

    private AbstractWorker getAbstractWorker(byte id) {
       switch (id) {
           case 0:
               return worker0;
           case 1:
               return worker1;
           case 2:
               return worker2;
           default:
               throw new IllegalArgumentException("Unknown worker id: " + id);
       }
    }

    private Worker getInterfaceWorker(byte id) {
        switch (id) {
            case 0:
                return worker0;
            case 1:
                return worker1;
            case 2:
                return worker2;
            default:
                throw new IllegalArgumentException("Unknown worker id: " + id);
        }
    }

    public Data(byte id, byte[] data) {
        this.data = data;
        this.abstractWorker = getAbstractWorker(id);
        this.worker = getInterfaceWorker(id);
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
    public int doStaticWork() {
        return Worker0.staticWork(data);
    }

}
