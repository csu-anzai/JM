/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * Факториал N вычисляется как 1⋅2⋅...⋅N.
 * Поскольку это очень быстро растущая функция, то даже для небольших N
 * вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
 * ввода-вывода добавит проверяющая система.
 */
package com.javamentor.Stepik_02_04_01;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {     //параметр лишь говорит до какого числа умножаем
        BigInteger value1 = BigInteger.ONE;             //начальная точка факториала
        for (int i = 1; i <= value; i++) {              //проходимся по всему value
            BigInteger j = BigInteger.valueOf(i);       //перевод int в BigInteger для перемножения
            value1 = value1.multiply(j);                //перемножаем начиная с 1 и до value
        }
        return value1;
    }
}
//        BigInteger ret = BigInteger.ONE;    //создаем единицу BigInteger
//        for (int i = 1; i <= value; ++i) {      //условие
//            ret = ret.multiply(BigInteger.valueOf(i));      //в результат пишем умножение результат * i
//        } return ret;       //возврат BigInteger
//    }
//}
