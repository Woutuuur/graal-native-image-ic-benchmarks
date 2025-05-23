package nl.vu.wouter.complex;

public class Worker200 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 0;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 0;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 242;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 243;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 244;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 245;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 246;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 247;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 248;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 249;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 250;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 251;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 252;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 253;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 254;
    }

    @Override
    public int abstractExtraWork9(byte[] data) {
        return data.length * 255;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 256;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 257;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 258;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 243;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 244;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 245;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 246;
    }

    public int uniqueMethod200_0(byte[] data) {
        return data.length * 200;
    }

    public static int staticWork(byte[] data) {
        return data.length + 401;
    }

}