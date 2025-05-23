package nl.vu.wouter.complex;

public class Worker183 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 3;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 3;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 225;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 226;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 227;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 228;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 229;
    }

    @Override
    public int abstractExtraWork9(byte[] data) {
        return data.length * 230;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 226;
    }

    public int uniqueMethod183_0(byte[] data) {
        return data.length * 183;
    }

    public int uniqueMethod183_1(byte[] data) {
        return data.length * 184;
    }

    public int uniqueMethod183_2(byte[] data) {
        return data.length * 185;
    }

    public static int staticWork(byte[] data) {
        return data.length + 367;
    }

}