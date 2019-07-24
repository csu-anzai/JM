/*
Реализуйте метод, вычисляющий симметрическую разность двух множеств.
Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
Пример
Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */

package com.jm.Stepik_06_02_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 1; i < 4; i++) {
            set1.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set2.add(i);
        }
        System.out.println(set1);
        System.out.println(set2);

        System.out.println(symmetricDifference(set1, set2));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>();
//        set3.addAll(set1);
//        set3.addAll(set2);

        if (set1.size() == set2.size()){
            Iterator<? extends T> iterator1 = set1.iterator();
            Iterator<? extends T> iterator2 = set2.iterator();
            while (iterator1.hasNext()){
                T itemSet1 = iterator1.next();
                while (itemSet1.)
            }
        }


        return set3;
    }


}
