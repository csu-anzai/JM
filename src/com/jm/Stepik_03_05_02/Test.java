package com.jm.Stepik_03_05_02;

public class Test {
    public static void main(String[] args) {

        byte[] test = {60, 61, 62, 63, 64, 65, 66};

        AsciiCharSequence ascii = new AsciiCharSequence(test);
        System.out.println(ascii.length());
        System.out.println(ascii.charAt(1));
        System.out.println(ascii.subSequence(0, 2));
        System.out.println(ascii.toString());


    }
}
