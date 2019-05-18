/**
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле
 * левых прямоугольников.
 * Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. Его метод applyAsDouble()
 * принимает значение аргумента и возвращает значение функции в заданной точке.
 * Интервал интегрирования задается его конечными точками a и b, причем a<=b. Для получения достаточно точного
 * результата используйте шаг сетки не больше 10−6.
 */
package com.jm.Stepik_03_05_01;

import java.util.function.DoubleUnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));

    }


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        int base = 10;
        int exp = -7;
        double countRectangles = Math.pow(base, Math.abs(exp));
        double length = 0.0;
        double width = (b - a) / countRectangles;
        for (double i = 0.0; i < countRectangles; i++) {
            length = length + f.applyAsDouble(i);
        }
        return length * width;
    }
}
