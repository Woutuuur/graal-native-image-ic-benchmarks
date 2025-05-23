package nl.vu.wouter.complex;

public class Worker114 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 14;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 14;
    }

    @Override
    public int abstractExtraWork13(byte[] data) {
        return data.length * 156;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 157;
    }

    @Override
    public int extraWork19(byte[] data) {
        return data.length * 158;
    }

    @Override
    public int extraWork3(byte[] data) {
        return data.length * 159;
    }

    @Override
    public int extraWork13(byte[] data) {
        return data.length * 160;
    }

    @Override
    public int extraWork5(byte[] data) {
        return data.length * 161;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 162;
    }

    public int uniqueMethod114_0(byte[] data) {
        return data.length * 114;
    }

    public int uniqueMethod114_1(byte[] data) {
        return data.length * 115;
    }

    public int uniqueMethod114_2(byte[] data) {
        return data.length * 116;
    }

    public static int staticWork(byte[] data) {
        return data.length + 229;
    }

}