package nl.vu.wouter.complex;

public class Worker146 extends Worker11 {

    @Override
    public int work(byte[] data) {
        return data.length + 6;
    }

    @Override
    public int extraWork1(byte[] data) {
        return super.extraWork1(data) + 146;
    }

    @Override
    public int extraWork9(byte[] data) {
        return super.extraWork9(data) + 146;
    }

    @Override
    public int extraWork18(byte[] data) {
        return super.extraWork18(data) + 146;
    }

    @Override
    public int extraWork4(byte[] data) {
        return super.extraWork4(data) + 146;
    }

    @Override
    public int abstractExtraWork2(byte[] data) {
        return data.length * 188;
    }

    @Override
    public int abstractExtraWork5(byte[] data) {
        return data.length * 189;
    }

    @Override
    public int abstractExtraWork18(byte[] data) {
        return data.length * 190;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 191;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 192;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 193;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 189;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 190;
    }

    public int uniqueMethod146_0(byte[] data) {
        return data.length * 146;
    }

    public static int staticWork(byte[] data) {
        return data.length + 293;
    }

}