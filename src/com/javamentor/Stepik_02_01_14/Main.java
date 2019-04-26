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
        System.out.println(flipBit(0, 1));
    }

    public static int flipBit(int value, int bitIndex) {

        //String j = Integer.toBinaryString(value);   //получили строку (1 и 0) из int
        String s = String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0');
        System.out.println("1)строка из числа: " + s);

        char[] arr = s.toCharArray();
        System.out.println("2)массив символов: " + arr);

        char g = arr[bitIndex];   //в символ кладем символ под индексом bitIndex
        System.out.println("3)символ под индексом bitIndex: " + g);

        int m = Character.getNumericValue(g);    //переводим этот символ в int и инвертируем
        System.out.println("4)int: " + m);

        if (m == 0) {
            m = 1;
        } else {
            m = 0;
        }
        System.out.println("5)после инвертирования: " + m);

        char i = (char)('0' + m);   //переводим int в символ
        System.out.println("6)символ: " + i);

        arr[bitIndex] = i;  //этот символ кладем в массив символов под индексом bitIndex
        System.out.println("7)индекс bitIndex в массиве: " + arr[bitIndex]);

        String tt = new String(arr);    //переводим массив char в строку
        System.out.println("8)строка из массива: " + tt);

        int t = Integer.parseInt(tt);   //переводим в Int
        System.out.println("9)число: " + t);

        return t;   //возвращием Int
    }
}

