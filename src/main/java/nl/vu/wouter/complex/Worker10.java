package nl.vu.wouter.complex;

public class Worker10 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 52;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 53;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 54;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 55;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 56;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 57;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 58;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 59;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 60;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 61;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 62;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 63;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 64;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 53;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 54;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 55;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 56;
    }

    public int uniqueMethod10_0(byte[] data) {
        return data.length * 10;
    }

    public int uniqueMethod10_1(byte[] data) {
        return data.length * 11;
    }

    public int uniqueMethod10_2(byte[] data) {
        return data.length * 12;
    }

    public static int staticWork(byte[] data) {
        return data.length + 21;
    }

}