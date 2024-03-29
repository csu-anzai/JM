/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
Решать можно разными способами:
воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после
просмотра соответствующих уроков).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
добавит проверяющая система.
 */

package com.jm.Stepik_02_02_02;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-64));
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}