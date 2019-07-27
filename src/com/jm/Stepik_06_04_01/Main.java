/*
Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:
Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
Первый элемент последовательности устанавливается равным этому числу.
Следующие элементы вычисляются по рекуррентной формуле Rn+1=mid(R2n), где mid — это функция, выделяющая второй, третий
и четвертый разряд переданного числа. Например, mid(123456)=345.
Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)
Пример
pseudoRandomStream(13) должен вернуть стрим, состоящий из следующих чисел:
13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
 */

package com.jm.Stepik_06_04_01;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(pseudoRandomStream(13));
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream integer = IntStream.iterate(seed, n -> n * n);
        integer.skip(0)
                .limit(3)
                .forEach(System.out::print);


        return integer; // your implementation here
    }
}
