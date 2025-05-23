package nl.vu.wouter.complex;

public class Worker165 extends Worker2 {

    @Override
    public int work(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int extraWork19(byte[] data) {
        return super.extraWork19(data) + 165;
    }

    @Override
    public int extraWork8(byte[] data) {
        return super.extraWork8(data) + 165;
    }

    @Override
    public int extraWork4(byte[] data) {
        return super.extraWork4(data) + 165;
    }

    @Override
    public int extraWork14(byte[] data) {
        return super.extraWork14(data) + 165;
    }

    @Override
    public int extraWork2(byte[] data) {
        return super.extraWork2(data) + 165;
    }

    @Override
    public int extraWork16(byte[] data) {
        return super.extraWork16(data) + 165;
    }

    @Override
    public int extraWork12(byte[] data) {
        return super.extraWork12(data) + 165;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 207;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 208;
    }

    public int uniqueMethod165_0(byte[] data) {
        return data.length * 165;
    }

    public int uniqueMethod165_1(byte[] data) {
        return data.length * 166;
    }

    public int uniqueMethod165_2(byte[] data) {
        return data.length * 167;
    }

    public static int staticWork(byte[] data) {
        return data.length + 331;
    }

}