/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 * Пример
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */

package com.jm.Stepik_05_03_01;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        byte[] test = {48, 49, 50, 51};
        Charset charset = null;

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(test);
            System.out.println(readAsString(byteArrayInputStream, charset));
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int num = 0;
        charset = StandardCharsets.US_ASCII;
        byte[] buf = new byte[5];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((num = inputStream.read(buf)) != -1) {
            byteArrayOutputStream.write(buf, 0, num);
            byteArrayOutputStream.flush();
        }
        return new String(buf, charset);
    }
}
 