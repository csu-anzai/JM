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

        byte[] buf = new byte[15];
        char[] cbuf = new char[15];
        charset = StandardCharsets.US_ASCII;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.US_ASCII);

        StringWriter stringWriter = new StringWriter();

        while ((num = (char)inputStream.read(buf)) != -1) {
            writer.write(cbuf, 0, num);
            writer.flush();
        }
        System.out.println(cbuf);
        return new String(cbuf);
    }
}
