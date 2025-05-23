package nl.vu.wouter.complex;

public class Worker84 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 4;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 4;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 126;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 127;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 128;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 129;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 127;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 128;
    }

    @Override
    public int extraWork4(byte[] data) {
        return data.length * 129;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 130;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 131;
    }

    public int uniqueMethod84_0(byte[] data) {
        return data.length * 84;
    }

    public int uniqueMethod84_1(byte[] data) {
        return data.length * 85;
    }

    public int uniqueMethod84_2(byte[] data) {
        return data.length * 86;
    }

    public static int staticWork(byte[] data) {
        return data.length + 169;
    }

}