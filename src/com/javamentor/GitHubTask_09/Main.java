/**
 * Задание:
 * Создайте метод static int getMinFromTwo(int x, int y),
 * который принимает два целочисленных параметра и возвращает наименьший из них.
 * Создайте метод static int getMinFromFour(int x, int y, int m, int n),
 * который принимает четыре целочисленных параметра и возвращает наименьший из них.
 * При том второй метод должен использовать первый.
 * Условия:
 * Оба метода должны принимать целочисленные параметры
 * Оба метода должны возвращать целочисленные параметры
 * Второй метод должен использовать первый
 * Методы не должны ничего выводить в консоль
 */

package com.javamentor.GitHubTask_09;

public class Main {
    public static void main(String[] args) {
        getMinFromFour(1, 2, 3, 4);
        //getMinFromSix(1, 2, 3, 4, 5, 6);

    }

    static int getMinFromTwo(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }


    }

    static int getMinFromFour(int x, int y, int m, int n) {
        int a = getMinFromTwo(x, y);
        int b = getMinFromTwo(a, m);
        int c = getMinFromTwo(b, n);
        return c;
    }

//    static int getMinFromThree(int x, int y, int m) {
//        int a = getMinFromTwo(x, y);
//        return Math.min(a,m);
//    }

//    static int getMinFromSix(int x, int y, int m, int n, int u, int p) {
//        int a = getMinFromThree(x, y, m);
//        int b = getMinFromThree(a, m, n);
//        int c = getMinFromThree(b, u, p);
//        return c;
//    }
}
