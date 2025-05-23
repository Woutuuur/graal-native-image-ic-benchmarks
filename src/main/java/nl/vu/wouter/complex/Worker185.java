package nl.vu.wouter.complex;

public class Worker185 extends Worker166 {

    @Override
    public int work(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 5;
    }

    @Override
    public int extraWork6(byte[] data) {
        return super.extraWork6(data) + 185;
    }

    @Override
    public int abstractExtraWork12(byte[] data) {
        return data.length * 227;
    }

    @Override
    public int abstractExtraWork8(byte[] data) {
        return data.length * 228;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 228;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 229;
    }

    @Override
    public int extraWork15(byte[] data) {
        return data.length * 230;
    }

    public int uniqueMethod185_0(byte[] data) {
        return data.length * 185;
    }

    public static int staticWork(byte[] data) {
        return data.length + 371;
    }

}