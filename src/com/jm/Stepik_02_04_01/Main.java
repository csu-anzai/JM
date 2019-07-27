/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал N вычисляется как 1⋅2⋅...⋅N.
Поскольку это очень быстро растущая функция, то даже для небольших N
вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
ввода-вывода добавит проверяющая система.
 */
package com.jm.Stepik_02_04_01;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    public static BigInteger factorial(int value) {
        BigInteger j = BigInteger.valueOf(value);           //перевод из инт в бигинт
        BigInteger i = BigInteger.ONE;                      //создаем переменную i
        if (value != 0) {                                   //рекурсия остановится когда value-1 дойдет до 0
            i = j.multiply(factorial(value - 1));     //пишем в i умножение value на (value - 1)
            return i;
        } return i;
    }
}