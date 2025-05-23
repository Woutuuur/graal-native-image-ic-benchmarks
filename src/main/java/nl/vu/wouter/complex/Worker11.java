package nl.vu.wouter.complex;

public class Worker11 extends Worker22 {

    @Override
    public int work(byte[] data) {
        return data.length + 11;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 53;
    }

    @Override
    public int abstractExtraWork9(byte[] data) {
        return data.length * 54;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 55;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 54;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 55;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 56;
    }

    @Override
    public int extraWork4(byte[] data) {
        return data.length * 57;
    }

    public int uniqueMethod11_0(byte[] data) {
        return data.length * 11;
    }

    public int uniqueMethod11_1(byte[] data) {
        return data.length * 12;
    }

    public int uniqueMethod11_2(byte[] data) {
        return data.length * 13;
    }

    public static int staticWork(byte[] data) {
        return data.length + 23;
    }

}