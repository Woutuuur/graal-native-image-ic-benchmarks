package nl.vu.wouter.complex;

public class Worker90 extends Worker1 {

    @Override
    public int work(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int extraWork1(byte[] data) {
        return super.extraWork1(data) + 90;
    }

    @Override
    public int extraWork19(byte[] data) {
        return super.extraWork19(data) + 90;
    }

    @Override
    public int extraWork3(byte[] data) {
        return super.extraWork3(data) + 90;
    }

    @Override
    public int extraWork13(byte[] data) {
        return super.extraWork13(data) + 90;
    }

    @Override
    public int extraWork7(byte[] data) {
        return super.extraWork7(data) + 90;
    }

    @Override
    public int extraWork0(byte[] data) {
        return super.extraWork0(data) + 90;
    }

    @Override
    public int extraWork2(byte[] data) {
        return super.extraWork2(data) + 90;
    }

    @Override
    public int extraWork16(byte[] data) {
        return super.extraWork16(data) + 90;
    }

    @Override
    public int extraWork17(byte[] data) {
        return super.extraWork17(data) + 90;
    }

    @Override
    public int extraWork12(byte[] data) {
        return super.extraWork12(data) + 90;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 132;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 133;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 134;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 135;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 136;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 137;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 138;
    }

    @Override
    public int extraWork11(byte[] data) {
        return data.length * 133;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 134;
    }

    public int uniqueMethod90_0(byte[] data) {
        return data.length * 90;
    }

    public int uniqueMethod90_1(byte[] data) {
        return data.length * 91;
    }

    public int uniqueMethod90_2(byte[] data) {
        return data.length * 92;
    }

    public static int staticWork(byte[] data) {
        return data.length + 181;
    }

}