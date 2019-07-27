/*
Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
Данная задача актуальна, например, при работе с битовыми полями.
Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит
проверяющая система.
 */
package com.jm.Stepik_02_01_04;

public class Main {
    public static void main(String[] args) {
        System.out.println(flipBit(22,10));
    }

    public static int flipBit(int value, int bitIndex) {
/**
 * Логика:
 * 1) Битовая маска. (bitIndex-1) - получаем правильный индекс бита, в данном случае -1 т.к. начинаем по условию
 * с 1 а не с 0
 * 2) Битовая маска. (1<<) - первый бит десятичного числа 1 (00000000 00000000 00000000 00000001) двигаем влево
 * на правильный индекс
 * 3) выполняем XOR (логическое НЕ-ИЛИ) между value и битовой маской
 *
 * Вопрос1: почему именно 1<<. Потому что так можно получить одну 1 в битовой маске для изменения value в этом бите.
 * Вопрос2: почему именно XOR. Потому что XOR меняет бит в value именно в bitIndex на противоположный.
 */
//        int x = 1<<(bitIndex - 1);      //двигаем 1 на bitIndex - получаем число
//        int result = value ^ x;         //выполняем XOR

        int a = 5;
        long b = 747435345;
        float c = Long.MAX_VALUE;
        System.out.println(c);
        System.out.println(Long.MAX_VALUE);
        return value ^ (1 << (bitIndex -1));
    }
}

