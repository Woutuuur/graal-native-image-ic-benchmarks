package nl.vu.wouter.complex;

public class Worker111 extends Worker201 {

    @Override
    public int abstractWork(byte[] data) {
        return data.length + 11;
    }

    @Override
    public int abstractExtraWork10(byte[] data) {
        return data.length * 153;
    }

    @Override
    public int abstractExtraWork14(byte[] data) {
        return data.length * 154;
    }

    @Override
    public int abstractExtraWork0(byte[] data) {
        return data.length * 155;
    }

    @Override
    public int extraWork6(byte[] data) {
        return data.length * 154;
    }

    @Override
    public int extraWork1(byte[] data) {
        return data.length * 155;
    }

    @Override
    public int extraWork8(byte[] data) {
        return data.length * 156;
    }

    @Override
    public int extraWork11(byte[] data) {
        return data.length * 157;
    }

    @Override
    public int extraWork7(byte[] data) {
        return data.length * 158;
    }

    @Override
    public int extraWork0(byte[] data) {
        return data.length * 159;
    }

    @Override
    public int extraWork2(byte[] data) {
        return data.length * 160;
    }

    @Override
    public int extraWork16(byte[] data) {
        return data.length * 161;
    }

    @Override
    public int extraWork12(byte[] data) {
        return data.length * 162;
    }

    public int uniqueMethod111_0(byte[] data) {
        return data.length * 111;
    }

    public int uniqueMethod111_1(byte[] data) {
        return data.length * 112;
    }

    public static int staticWork(byte[] data) {
        return data.length + 223;
    }

}