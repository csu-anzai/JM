/**
 * Задание:
 * Создайте метод static void printArray(int arr),
 * который принимает массив целых чисел и выводит их в консоль,
 * каждое с новой строки.
 * Условия:
 * Метод должен принимать массив целых чисел
 * Метод не должен ничего возвращать
 * Метод должен выводить каждое число с новой строки
 */

package com.javamentor.GitHubTask011;

public class Main {
    public static void main (String[] args) {
    }
    static void printArray(int[] arr) { //снова добавил в параметр []

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
