package nl.vu.wouter.complex;

public interface Worker {

    int work(byte[] data);

    default int extraWork0(byte[] data) {
        return data.length + 0;
    }

	default int extraWork1(byte[] data) {
        return data.length + 1;
    }

	default int extraWork2(byte[] data) {
        return data.length + 2;
    }

	default int extraWork3(byte[] data) {
        return data.length + 3;
    }

	default int extraWork4(byte[] data) {
        return data.length + 4;
    }

	default int extraWork5(byte[] data) {
        return data.length + 5;
    }

	default int extraWork6(byte[] data) {
        return data.length + 6;
    }

	default int extraWork7(byte[] data) {
        return data.length + 7;
    }

	default int extraWork8(byte[] data) {
        return data.length + 8;
    }

	default int extraWork9(byte[] data) {
        return data.length + 9;
    }

	default int extraWork10(byte[] data) {
        return data.length + 10;
    }

	default int extraWork11(byte[] data) {
        return data.length + 11;
    }

	default int extraWork12(byte[] data) {
        return data.length + 12;
    }

	default int extraWork13(byte[] data) {
        return data.length + 13;
    }

	default int extraWork14(byte[] data) {
        return data.length + 14;
    }

	default int extraWork15(byte[] data) {
        return data.length + 15;
    }

	default int extraWork16(byte[] data) {
        return data.length + 16;
    }

	default int extraWork17(byte[] data) {
        return data.length + 17;
    }

	default int extraWork18(byte[] data) {
        return data.length + 18;
    }

	default int extraWork19(byte[] data) {
        return data.length + 19;
    }

}