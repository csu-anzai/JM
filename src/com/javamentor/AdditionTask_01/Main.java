/**
 * От Евгения Калашникова
 * Напиши Java-программу для вычисления среднего значения массива целых чисел,
 * кроме самых больших и самых маленьких значений.
 */
package com.javamentor.AdditionTask_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x1 = {22, 3, 52, 15, 100, 99};                        //задаем массив
        System.out.println(Arrays.toString(x1));                    //выводим в консоль
        if (x1.length < 3){                                         //проверка на количество элементов
            System.out.println("Мало элементов массива");
        } else {
            retMiddleArray(x1);                                     //если норм - выполняем метод
        }
    }
    public static float retMiddleArray(int[] a1) {
        /**
         * здесь необходима проверка на дубли, например {0, 0, 2, 6, 8, 8}
         */
        Arrays.sort(a1);                                            //сортируем массив
        System.out.println(Arrays.toString(a1));                    //выводим в консоль отсортированный массив
        int[] a2 = new int[a1.length-2];                            //создаем новый массив размером меньше первого на 2
        for (int i = 0; i < a2.length; i++){                        //условие цикла
            a2[i] = a1[i + 1];                                      //кладем во второй массив элементы первого со сдвигом
        }
        System.out.println(Arrays.toString(a2));                    //выводим в консоль второй массив
        int j = 0;                                                  //сумма элементов
        for (int i = 0; i < a2.length; i++){                        //условие цикла
            j = j + a2[i];                                          //складываем все элементы массива
        }
        System.out.println(j);                                      //выводим в консоль сумму элементов
        float m = (float)j/a2.length;                               //среднее значение приводим ко float
        System.out.println(m);
        return m;                                                   //возвращаем среднее значение
    }
}
