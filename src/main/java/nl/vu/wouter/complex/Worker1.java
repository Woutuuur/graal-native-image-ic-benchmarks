package nl.vu.wouter.complex;

public class Worker1 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 1;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 1;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 43;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 44;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 45;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 46;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 47;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 48;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 49;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 50;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 51;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 52;
    }

    @Override
    public int abstractExtraWork7(byte[] data) {
        return data.length * 53;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 54;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 55;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 56;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 57;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 58;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 59;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 44;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 45;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 46;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 47;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 48;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 49;
    }

    @Override
    public int extraWork2(byte[] data) {
        return data.length * 50;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 51;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 52;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 53;
    }

    public int uniqueMethod1_0(byte[] data) {
        return data.length * 1;
    }

    public static int staticWork(byte[] data) {
        return data.length + 3;
    }

}