package nl.vu.wouter.complex;

public class Worker245 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 287;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 288;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 289;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 290;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 291;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 292;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 293;
    }

    @Override
    public int extraWork6(byte[] data) {
        return data.length * 288;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 289;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 290;
    }

    @Override
    public int extraWork11(byte[] data) {
        return data.length * 291;
    }

    @Override
    public int extraWork4(byte[] data) {
        return data.length * 292;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 293;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 294;
    }

    public int uniqueMethod245_0(byte[] data) {
        return data.length * 245;
    }

    public static int staticWork(byte[] data) {
        return data.length + 491;
    }

}