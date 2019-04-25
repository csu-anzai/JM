/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 * Данная задача актуальна, например, при работе с битовыми полями.
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит
 * проверяющая система.
 */
package com.javamentor.Stepik_02_1_14;

public class Main {
    public static void main (String[] args) {

    }

    public static int flipBit(int value, int bitIndex) {


        return bitIndex >> value; // put your implementation here
    }
}
