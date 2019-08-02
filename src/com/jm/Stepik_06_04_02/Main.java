/*
Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите
minMaxConsumer.accept(null, null);
 */

package com.jm.Stepik_06_04_02;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        Stream<Integer> stream = Stream.of(2, 4, 1, -5);
//        Comparator<Integer> order = (o1, o2) -> o1.compareTo(o2);
//        BiConsumer<Integer, Integer> minMaxConsumer = (obj1, obj2) -> obj1.compareTo(obj2);
//
//        System.out.println(findMinMax(stream, order, minMaxConsumer);
    }

    public static <T> void findMinMax(
            Stream<? super T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

//            List <T> list = (List <T>) stream.collect(Collectors.toList());
//            list.sort(order);

        T[] arr = (T[]) stream.toArray();
        Arrays.sort(arr, order);
        if (arr.length == 0){
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(arr[0], arr[arr.length - 1]);
        }
    }
}

