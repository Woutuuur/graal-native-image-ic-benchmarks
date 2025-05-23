package nl.vu.wouter.complex;

public class Worker105 extends Worker65 {

    @Override
    public int work(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int extraWork1(byte[] data) {
        return super.extraWork1(data) + 105;
    }

    @Override
    public int extraWork19(byte[] data) {
        return super.extraWork19(data) + 105;
    }

    @Override
    public int extraWork13(byte[] data) {
        return super.extraWork13(data) + 105;
    }

    @Override
    public int extraWork11(byte[] data) {
        return super.extraWork11(data) + 105;
    }

    @Override
    public int extraWork10(byte[] data) {
        return super.extraWork10(data) + 105;
    }

    @Override
    public int extraWork7(byte[] data) {
        return super.extraWork7(data) + 105;
    }

    @Override
    public int extraWork2(byte[] data) {
        return super.extraWork2(data) + 105;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 147;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 148;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 149;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 150;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 151;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 148;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 149;
    }

    public int uniqueMethod105_0(byte[] data) {
        return data.length * 105;
    }

    public int uniqueMethod105_1(byte[] data) {
        return data.length * 106;
    }

    public static int staticWork(byte[] data) {
        return data.length + 211;
    }

}