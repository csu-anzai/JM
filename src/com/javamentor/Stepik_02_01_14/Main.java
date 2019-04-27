/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 * Данная задача актуальна, например, при работе с битовыми полями.
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит
 * проверяющая система.
 */
package com.javamentor.Stepik_02_01_14;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(flipBit(13,2));
    }

    public static int flipBit(int value, int bitIndex) {

        String s = Integer.toBinaryString(value);   //получили строку (1 и 0) из int
        System.out.println(s);

//        String s = String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0'); //чтобы не отбрасывать нули

        char[] arr = s.toCharArray();

        int m = Character.getNumericValue(arr[bitIndex]);    //переводим этот символ в int и инвертируем

        if (m == 0) {
            m = 1;
        } else {
            m = 0;
        }

        char i = (char)('0' + m);   //переводим int в символ

        arr[bitIndex] = i;  //этот символ кладем в массив символов под индексом bitIndex

        String tt = new String(arr);    //переводим массив char в строку

        int t = Integer.parseInt(tt, 2);   //переводим из двоичного в десятичное

        return t;   //возвращием Int
    }
}