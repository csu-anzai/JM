package com.jm.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Stepik_IO {
    public static void main(String[] args) throws IOException {
        int num = 0;

        byte[] buf = new byte[5];
        char[] cbuf = new char[5];

        Writer writer = new OutputStreamWriter(new ByteArrayOutputStream(), StandardCharsets.US_ASCII);

        while ((num = System.in.read()) != -1) {
            writer.write(cbuf);
            writer.flush();
        }
    }
}
