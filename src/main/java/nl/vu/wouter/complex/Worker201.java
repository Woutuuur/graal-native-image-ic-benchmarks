package nl.vu.wouter.complex;

public class Worker201 extends Worker127 {

    @Override
    public int work(byte[] data) {
        return data.length + 1;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 1;
    }

    @Override
    public int extraWork5(byte[] data) {
        return super.extraWork5(data) + 201;
    }

    @Override
    public int extraWork15(byte[] data) {
        return super.extraWork15(data) + 201;
    }

    @Override
    public int extraWork10(byte[] data) {
        return super.extraWork10(data) + 201;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 243;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 244;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 245;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 246;
    }

    @Override
    public int extraWork6(byte[] data) {
        return data.length * 244;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 245;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 246;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 247;
    }

    @Override
    public int extraWork14(byte[] data) {
        return data.length * 248;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 249;
    }

    public int uniqueMethod201_0(byte[] data) {
        return data.length * 201;
    }

    public static int staticWork(byte[] data) {
        return data.length + 403;
    }

}