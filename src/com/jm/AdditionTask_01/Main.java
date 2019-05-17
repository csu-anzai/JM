/**
 * От Евгения Калашникова
 * Напиши Java-программу для вычисления среднего значения массива целых чисел,
 * кроме самых больших и самых маленьких значений.
 */
package com.jm.AdditionTask_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x1 = {1, 3, 7, 4, 9, 7, 3, 1, 3, 1, 9, 9};            //задаем массив
        System.out.println(Arrays.toString(x1));                    //выводим в консоль
        if (x1.length < 3){                                         //проверка на количество элементов
            System.out.println("Мало элементов массива");
        } else {
            retMiddleArray(x1);                                     //если норм - выполняем метод
        }
    }
    public static float retMiddleArray(int[] a1) {
        Arrays.sort(a1);                                            //сортируем массив
        System.out.println(Arrays.toString(a1));                    //выводим в консоль отсортированный массив

        int k1 = 0;                                                 //количество дублей минимального значения
        for (int i = 0; i < a1.length; i++) {
            if (a1[0] == a1[i]) {
                k1++;
            }
        }
        System.out.println(k1);
        int k2 = 0;                                                 //количество дублей максимального значения
        for (int i = 0; i < a1.length; i++) {
            if (a1[a1.length-1] == a1[i]) {
                k2++;
            }
        }
        System.out.println(k2);

        int[] a2 = new int[a1.length - (k1 + k2)];                  //создаем новый массив размером меньше первого
        for (int i = 0; i < a2.length; i++){                        //условие цикла
            a2[i] = a1[i + k1];                                     //кладем во второй массив элементы первого со сдвигом
        }
        System.out.println(Arrays.toString(a2));                    //выводим в консоль второй массив

        int j = 0;                                                  //считаем сумму оставшихся элементов массива
        for (int i = 0; i < a2.length; i++){                        //условие цикла
            j = j + a2[i];                                          //складываем все элементы массива
        }
        System.out.println(j);                                      //выводим в консоль сумму элементов
        float m = (float)j/a2.length;                               //среднее значение приводим ко float
        System.out.println(m);
        return m;                                                   //возвращаем среднее значение
    }
}
