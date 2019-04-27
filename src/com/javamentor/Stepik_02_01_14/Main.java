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
        System.out.println(flipBit(1,0));
    }

    public static int flipBit(int value, int bitIndex) {

        String s = String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0'); //чтобы не отбрасывать нули
        System.out.println(s);

        char[] arr = s.toCharArray();   //создаем массив и инициализируем символами

        int m = Character.getNumericValue(arr[32-bitIndex]);    //переводим этот символ в int и инвертируем
        System.out.println(m);

        if (m == 0) {
            m = 1;
        } else {
            m = 0;
        }

        char i = (char)('0' + m);   //КОСТЫЛЬ. переводим int в char
        System.out.println(i);

        arr[32-bitIndex] = i;  //этот символ кладем в массив символов под индексом bitIndex

        String tt = new String(arr);    //переводим массив char в строку
        System.out.println(tt);

        int t = Integer.parseInt(tt, 2);   //переводим из двоичного в десятичное

        return t;   //возвращием Int
    }
}