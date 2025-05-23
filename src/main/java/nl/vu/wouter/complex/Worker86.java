package nl.vu.wouter.complex;

public class Worker86 extends Worker80 {

    @Override
    public int work(byte[] data) {
        return data.length + 6;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 6;
    }

    @Override
    public int extraWork6(byte[] data) {
        return super.extraWork6(data) + 86;
    }

    @Override
    public int extraWork1(byte[] data) {
        return super.extraWork1(data) + 86;
    }

    @Override
    public int extraWork3(byte[] data) {
        return super.extraWork3(data) + 86;
    }

    @Override
    public int extraWork13(byte[] data) {
        return super.extraWork13(data) + 86;
    }

    @Override
    public int extraWork11(byte[] data) {
        return super.extraWork11(data) + 86;
    }

    @Override
    public int extraWork4(byte[] data) {
        return super.extraWork4(data) + 86;
    }

    @Override
    public int extraWork10(byte[] data) {
        return super.extraWork10(data) + 86;
    }

    @Override
    public int extraWork5(byte[] data) {
        return super.extraWork5(data) + 86;
    }

    @Override
    public int extraWork14(byte[] data) {
        return super.extraWork14(data) + 86;
    }

    @Override
    public int extraWork9(byte[] data) {
        return super.extraWork9(data) + 86;
    }

    @Override
    public int extraWork2(byte[] data) {
        return super.extraWork2(data) + 86;
    }

    @Override
    public int extraWork12(byte[] data) {
        return super.extraWork12(data) + 86;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 128;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 129;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 129;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 130;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 131;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 132;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 133;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 134;
    }

    public int uniqueMethod86_0(byte[] data) {
        return data.length * 86;
    }

    public int uniqueMethod86_1(byte[] data) {
        return data.length * 87;
    }

    public int uniqueMethod86_2(byte[] data) {
        return data.length * 88;
    }

    public static int staticWork(byte[] data) {
        return data.length + 173;
    }

}