package nl.vu.wouter.complex;

public class Worker182 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 2;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 2;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 224;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 225;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 226;
    }

    public int uniqueMethod182_0(byte[] data) {
        return data.length * 182;
    }

    public int uniqueMethod182_1(byte[] data) {
        return data.length * 183;
    }

    public int uniqueMethod182_2(byte[] data) {
        return data.length * 184;
    }

    public static int staticWork(byte[] data) {
        return data.length + 365;
    }

}