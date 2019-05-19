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

public class AsciiCharSequence implements CharSequence{

    public static void main(String[] args) {
        byte[] bb = {1,22,33};
        AsciiCharSequence aa = new AsciiCharSequence(bb);
        System.out.println(aa.length());
    }

    byte[] array;

    public AsciiCharSequence(byte[] c){
        for (int i = 0; i < c.length; i++){
            array[i] = c[i];
        }
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char)array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.subSequence(start, end);
    }

}

