package nl.vu.wouter.complex;

public class Worker187 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 7;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 7;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 229;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 230;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 231;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 232;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 230;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 231;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 232;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 233;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 234;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 235;
    }

    public int uniqueMethod187_0(byte[] data) {
        return data.length * 187;
    }

    public int uniqueMethod187_1(byte[] data) {
        return data.length * 188;
    }

    public static int staticWork(byte[] data) {
        return data.length + 375;
    }

}