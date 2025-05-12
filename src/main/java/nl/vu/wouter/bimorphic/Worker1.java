package nl.vu.wouter.bimorphic;

public class Worker1 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length;
    }

    public static int staticWork(byte[] data) {
        return data.length;
    }

}
