package com.jm.Test;

import java.io.ByteArrayInputStream;

public class Stepik_05_03_Read {
    public static void main(String[] args) {
        byte myByte = -1; // 11111111

        byte[] myArray = {myByte};
        ByteArrayInputStream in = new ByteArrayInputStream(myArray);

        int myInt = in.read();
        System.out.println(myInt); // 255
    }


}
