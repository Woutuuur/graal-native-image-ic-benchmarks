package nl.vu.wouter.complex;

public class Worker48 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 8;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 8;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 90;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 91;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 92;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 93;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 94;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 95;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 96;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 97;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 98;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 99;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 91;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 92;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 93;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 94;
    }

    public int uniqueMethod48_0(byte[] data) {
        return data.length * 48;
    }

    public int uniqueMethod48_1(byte[] data) {
        return data.length * 49;
    }

    public static int staticWork(byte[] data) {
        return data.length + 97;
    }

}