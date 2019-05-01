/**
 * Напиши Java-программу для вычисления среднего значения массива целых чисел,
 * кроме самых больших и самых маленьких значений.
 */
package com.javamentor.AdditionTask_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x1 = {22, 3, 52, 15, 100, 99};
        System.out.println(Arrays.toString(x1));
        if (x1.length < 3){
            System.out.println("Мало элементов массива");
        } else {
            retMiddleArray(x1);
        }
    }
    public static float retMiddleArray(int[] a1) {
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        int[] a2 = new int[a1.length-2];
        for (int i = 0; i < a2.length; i++){
            a2[i] = a1[i + 1];
        }
        System.out.println(Arrays.toString(a2));
        int j = 0;
        for (int i = 0; i < a2.length; i++){
            j = j + a2[i];
        }
        System.out.println(j);
        float m = (float)j/a2.length;
        System.out.println(m);
        return m;
    }
}
