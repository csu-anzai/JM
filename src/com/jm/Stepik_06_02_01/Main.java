/*
Реализуйте метод, вычисляющий симметрическую разность двух множеств.
Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.
Пример
Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
 */

package com.jm.Stepik_06_02_01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<Integer>();
        Set<Integer> set2 = new LinkedHashSet<Integer>();

        for (int i = 1; i < 4; i++) {
            set1.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set2.add(i);
        }

//        System.out.println(symmetricDifference(set1, set2));

    }

//    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
//        Set<Integer> set3 = new LinkedHashSet<>();
//        for (int i = 0; i < set1.size(); i++){
//            set3.add(set1);
//        }
//        for (int i = 0; i < set2.size(); i++){
//            set3.add(set2(i));
//        }
//        return null;
//    }


}
