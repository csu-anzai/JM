/**
 * Какими байтами представляется символ 'Ы' в кодировке UTF-8? Введите десятичные беззнаковые значения байт через
 * пробел, например, 10 34 254.
 */
package com.jm.Test;

import java.io.*;

public class ReadInUTF8 {
    public static void main(String[] args) throws IOException {
        int num = 0;

        while ((num = System.in.read()) != -1) {
            System.out.println(num);
        }
    }
}
