package nl.vu.wouter.complex;

public class Worker21 extends Worker141 {

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 63;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 64;
    }

    @Override
    public int abstractExtraWork9(byte[] data) {
        return data.length * 65;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 64;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 65;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 66;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 67;
    }

    @Override
    public int extraWork14(byte[] data) {
        return data.length * 68;
    }

    @Override
    public int extraWork2(byte[] data) {
        return data.length * 69;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 70;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 71;
    }

    public int uniqueMethod21_0(byte[] data) {
        return data.length * 21;
    }

    public int uniqueMethod21_1(byte[] data) {
        return data.length * 22;
    }

    public int uniqueMethod21_2(byte[] data) {
        return data.length * 23;
    }

    public static int staticWork(byte[] data) {
        return data.length + 43;
    }

}