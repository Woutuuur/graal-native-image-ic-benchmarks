package nl.vu.wouter.complex;

public class Worker50 extends Worker160 {

    @Override
    public int work(byte[] data) {
        return data.length + 10;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 92;
    }

    @Override
    public int abstractExtraWork1(byte[] data) {
        return data.length * 93;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 94;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 95;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 96;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 97;
    }

    @Override
    public int abstractExtraWork15(byte[] data) {
        return data.length * 98;
    }

    @Override
    public int abstractExtraWork19(byte[] data) {
        return data.length * 99;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 93;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 94;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 95;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 96;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 97;
    }

    public int uniqueMethod50_0(byte[] data) {
        return data.length * 50;
    }

    public int uniqueMethod50_1(byte[] data) {
        return data.length * 51;
    }

    public int uniqueMethod50_2(byte[] data) {
        return data.length * 52;
    }

    public static int staticWork(byte[] data) {
        return data.length + 101;
    }

}