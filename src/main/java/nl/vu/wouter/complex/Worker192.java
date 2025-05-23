package nl.vu.wouter.complex;

public class Worker192 extends AbstractWorker implements Worker {

    @Override
    public int work(byte[] data) {
        return data.length + 12;
    }

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 12;
    }

    @Override
    public int abstractExtraWork16(byte[] data) {
        return data.length * 234;
    }

    @Override
    public int abstractExtraWork6(byte[] data) {
        return data.length * 235;
    }

    @Override
    public int abstractExtraWork3(byte[] data) {
        return data.length * 236;
    }

    @Override
    public int extraWork6(byte[] data) {
        return data.length * 235;
    }

    @Override
    public int extraWork17(byte[] data) {
        return data.length * 236;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 237;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 238;
    }

    public int uniqueMethod192_0(byte[] data) {
        return data.length * 192;
    }

    public int uniqueMethod192_1(byte[] data) {
        return data.length * 193;
    }

    public int uniqueMethod192_2(byte[] data) {
        return data.length * 194;
    }

    public static int staticWork(byte[] data) {
        return data.length + 385;
    }

}