package nl.vu.wouter.complex;

public class Worker233 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 13;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 13;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 275;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 276;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 277;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 278;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 276;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 277;
    }

    @Override
    public int extraWork14(byte[] data) {
        return data.length * 278;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 279;
    }

    public int uniqueMethod233_0(byte[] data) {
        return data.length * 233;
    }

    public static int staticWork(byte[] data) {
        return data.length + 467;
    }

}