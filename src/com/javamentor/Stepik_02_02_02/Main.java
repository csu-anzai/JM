/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * Решать можно разными способами:
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после
 * просмотра соответствующих уроков).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
 * добавит проверяющая система.
 */
package com.javamentor.Stepik_02_02_02;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
        System.out.println(~4);
        System.out.println(-5&1);
        System.out.println(5&4);

    }

    public static boolean isPowerOfTwo(int value) {

        value = Math.abs(value);
        System.out.println(value);

//        int x = Integer.MAX_VALUE;
//
//        double y = 0;
//        int p = 0;
//        int g = 0;
//
//        for (int i = 0; i < x; i++) {
//            y = Math.pow(2, i);
//            p = (int) y;
////            int g = 0;
//
//            if (value == p) {
//                g = 1;
//            } else {
//                g = 0;
//            }
//        }
//        if (g == 1) {
//            return true;
//        }
/**
 * Решение списал.
 * https://www.exploringbinary.com/ten-ways-to-check-if-an-integer-is-a-power-of-two-in-c/
 * Сначала проверяем что результат не равен 0
 * Потом работаем с битами числа ((value & (~value + 1)) - проверка на принадлежность степени двойки.
 */
        return ((value != 0) && (value & (~value + 1)) == value); //Списал. https://www.exploringbinary.com/ten-ways-to-check-if-an-integer-is-a-power-of-two-in-c/
    }
}

