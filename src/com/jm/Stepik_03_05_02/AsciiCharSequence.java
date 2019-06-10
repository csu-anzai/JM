/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов
 * (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти.
 * Класс AsciiCharSequence должен:
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определять методы length(), charAt(), subSequence() и toString()
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence
 * (JavaDoc или исходники).
 * В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
 * поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.
 */

package com.jm.Stepik_03_05_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{

    //определяем поля класса
    private byte[] array;

    //конструктор
    public AsciiCharSequence(byte[] array) {
//        this.array = array;
        this.array = Arrays.copyOf(array, array.length); //переписал через копирование массива

    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        char ch = '\u0000';
        if ((index >= 0) & (index <= array.length)) {
            ch = (char)array[index];
        }
        return ch;
    }

    @Override
    public CharSequence subSequence(int start, int end) { // Arrays.copyOf
        byte[] newArray = new byte[end - start];
        for (int i = start; i < end; i++) {
            newArray[i - start] = array[i]; //i-start что б был 0-ой индекс, а не скажем 8
        }
        return new AsciiCharSequence(newArray); //вопрос - почему new Ascii а не CharSequence?
    }

    @Override
    public String toString() {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            result.append((char)array[i]);
//        }
//        return result.toString(); //тк у StringBuilder есть метод toString - нужный нам возвращаемы тип
//    }
//        String result = new String(array);
        return new String(array); //через конструктор Стринга
    }
}