package nl.vu.wouter.complex;

public class Worker29 extends Worker81 {

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 9;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 71;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 72;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 73;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 74;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 75;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 72;
    }

    public int uniqueMethod29_0(byte[] data) {
        return data.length * 29;
    }

    public int uniqueMethod29_1(byte[] data) {
        return data.length * 30;
    }

    public int uniqueMethod29_2(byte[] data) {
        return data.length * 31;
    }

    public static int staticWork(byte[] data) {
        return data.length + 59;
    }

}