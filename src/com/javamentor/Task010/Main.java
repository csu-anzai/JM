/**
 * Задание:
 * Cоздайте метод static int fillArray(int x),
 * который принимает целое число и возвращает массив целых чисел,
 * размером равный этому числу и заполненный числами от 0 до числа,
 * меньшего на единицу, чем принятое.
 * Условия:
 * Метод должен принимать целое число
 * Метод не должен ничего выводить в консоль
 * Метод должен возвращать массив целых чисел
 */

package com.javamentor.Task010;

public class Main {
    public static void main (String[] args) {

    }
    static int[] fillArray(int x) {
        int nums[] = new int[x];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = i;
            }
                return nums;
    }
}
