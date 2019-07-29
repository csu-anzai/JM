/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите
minMaxConsumer.accept(null, null);
 */

package com.jm.Stepik_06_04_02;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    }

    public static <T> void findMinMax(
            Stream<? super T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {


        if (stream.count() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept();
        }
    }
}