package nl.vu.wouter.complex;

public class Worker30 extends Worker9 {

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int extraWork2(byte[] data) {
        return super.extraWork2(data) + 30;
    }

    @Override
    public int extraWork14(byte[] data) {
        return super.extraWork14(data) + 30;
    }

    @Override
    public int extraWork4(byte[] data) {
        return super.extraWork4(data) + 30;
    }

    @Override
    public int extraWork7(byte[] data) {
        return super.extraWork7(data) + 30;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 72;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 73;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 74;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 75;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 76;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 77;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 78;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 79;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 73;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 74;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 75;
    }

    @Override
    public int extraWork11(byte[] data) {
        return data.length * 76;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 77;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 78;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 79;
    }

    public int uniqueMethod30_0(byte[] data) {
        return data.length * 30;
    }

    public int uniqueMethod30_1(byte[] data) {
        return data.length * 31;
    }

    public static int staticWork(byte[] data) {
        return data.length + 61;
    }

}