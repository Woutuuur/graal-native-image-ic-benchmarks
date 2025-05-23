package nl.vu.wouter.complex;

public class Worker31 extends Worker51 {

    @Override
    public int work(byte[] data) {
        return data.length + 11;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 11;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 73;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 74;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 75;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 76;
    }

    @Override
    public int extraWork4(byte[] data) {
        return data.length * 77;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 78;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 79;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 80;
    }

    public int uniqueMethod31_0(byte[] data) {
        return data.length * 31;
    }

    public static int staticWork(byte[] data) {
        return data.length + 63;
    }

}