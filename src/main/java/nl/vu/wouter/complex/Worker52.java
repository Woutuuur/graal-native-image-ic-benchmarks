package nl.vu.wouter.complex;

public class Worker52 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 12;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 12;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 94;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 95;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 96;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 97;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 98;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 99;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 100;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 101;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 102;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 103;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 104;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 105;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 106;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 107;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 108;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 95;
    }

    public int uniqueMethod52_0(byte[] data) {
        return data.length * 52;
    }

    public static int staticWork(byte[] data) {
        return data.length + 105;
    }

}