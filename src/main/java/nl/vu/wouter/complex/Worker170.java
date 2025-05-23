package nl.vu.wouter.complex;

public class Worker170 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 212;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 213;
    }

    @Override
    public int abstractExtraWork11(byte[] data) {
        return data.length * 214;
    }

    @Override
    public int abstractExtraWork4(byte[] data) {
        return data.length * 215;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 216;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 217;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 218;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 219;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 213;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 214;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 215;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 216;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 217;
    }

    @Override
    public int extraWork2(byte[] data) {
        return data.length * 218;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 219;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 220;
    }

    public int uniqueMethod170_0(byte[] data) {
        return data.length * 170;
    }

    public static int staticWork(byte[] data) {
        return data.length + 341;
    }

}