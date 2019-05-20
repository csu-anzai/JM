package com.jm.Stepik_03_05_02;

public class Test {
    public static void main(String[] args) {

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(new byte[] {1, 2, 3, 0});
        System.out.println(asciiCharSequence.array.length);

        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(1));
    }
}
