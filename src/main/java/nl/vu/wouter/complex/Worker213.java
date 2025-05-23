package nl.vu.wouter.complex;

public class Worker213 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 13;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 13;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 255;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 256;
    }

    @Override
    public int abstractExtraWork17(byte[] data) {
        return data.length * 257;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 258;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 259;
    }

    @Override
    public int extraWork6(byte[] data) {
        return data.length * 256;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 257;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 258;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 259;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 260;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 261;
    }

    @Override
    public int extraWork10(byte[] data) {
        return data.length * 262;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 263;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 264;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 265;
    }

    @Override
    public int extraWork9(byte[] data) {
        return data.length * 266;
    }

    @Override
    public int extraWork14(byte[] data) {
        return data.length * 267;
    }

    @Override
    public int extraWork18(byte[] data) {
        return data.length * 268;
    }

    @Override
    public int extraWork2(byte[] data) {
        return data.length * 269;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 270;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 271;
    }

    public int uniqueMethod213_0(byte[] data) {
        return data.length * 213;
    }

    public int uniqueMethod213_1(byte[] data) {
        return data.length * 214;
    }

    public int uniqueMethod213_2(byte[] data) {
        return data.length * 215;
    }

    public static int staticWork(byte[] data) {
        return data.length + 427;
    }

}