/*
В классе AsciiCharSequence создайте метод boolean determineAdult(int age),
который будет принимать возраст человека и возвращать логическое значение,
равное true если он 18 и больше и false если он меньше 18,
если переданное число меньше 0, метод должен вывести в консоль “Ошибка!
Введите правильный возраст.” и вернуть false.
 */

package com.jm.GitHubTask_06;

public class Main {
    public static void main(String[] args) {
    }
    static void printJavaWord(int count) {
        int j = 0;
        while (j < count) {
            System.out.println("Java");
            j++;
        }
    }

    boolean determineAdult(int age) {
       if (age < 0) {
           System.out.println("Ошибка! Введите правильный возраст.");
           return false;
       }
       else
           if (0 < age & age < 18) {
           return false;
           }
           else
               return true;
    }
}
