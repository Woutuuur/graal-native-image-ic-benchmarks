package nl.vu.wouter.complex;

public class Worker58 extends Worker246 {

    @Override
    public int work(byte[] data) {
        return data.length + 18;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 18;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 100;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 101;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 101;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 102;
    }

    public int uniqueMethod58_0(byte[] data) {
        return data.length * 58;
    }

    public static int staticWork(byte[] data) {
        return data.length + 117;
    }

}