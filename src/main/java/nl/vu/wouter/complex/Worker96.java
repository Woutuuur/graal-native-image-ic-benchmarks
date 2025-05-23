package nl.vu.wouter.complex;

public class Worker96 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 16;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 16;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 138;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 139;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 140;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 141;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 142;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 143;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 144;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 145;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 146;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 147;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 148;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 149;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 150;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 151;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 139;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 140;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 141;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 142;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 143;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 144;
    }

    @Override
    public int extraWork14(byte[] data) {
        return data.length * 145;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 146;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 147;
    }

    public int uniqueMethod96_0(byte[] data) {
        return data.length * 96;
    }

    public static int staticWork(byte[] data) {
        return data.length + 193;
    }

}