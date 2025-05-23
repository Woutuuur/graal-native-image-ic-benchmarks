package nl.vu.wouter.complex;

public class Worker64 extends Worker87 {

    @Override
    public int work(byte[] data) {
        return data.length + 4;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 4;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 106;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 107;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 108;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 109;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 107;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 108;
    }

    @Override
    public int extraWork14(byte[] data) {
        return data.length * 109;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 110;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 111;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 112;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 113;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 114;
    }

    public int uniqueMethod64_0(byte[] data) {
        return data.length * 64;
    }

    public int uniqueMethod64_1(byte[] data) {
        return data.length * 65;
    }

    public int uniqueMethod64_2(byte[] data) {
        return data.length * 66;
    }

    public static int staticWork(byte[] data) {
        return data.length + 129;
    }

}