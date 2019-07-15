/**
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных
 * чисел с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от
 * окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 * На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение
 * проверяющей системы), метод main, прописать все import'ы.
 */

package com.jm.Stepik_05_03_02;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double d1 = 0.0;
        double sumDouble = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                d1 += Double.parseDouble(scanner.next());
            } catch (NumberFormatException e1) {
                e1.getMessage();
            }
        }
        System.out.printf("%.6f", d1);
        scanner.close();
    }
}



