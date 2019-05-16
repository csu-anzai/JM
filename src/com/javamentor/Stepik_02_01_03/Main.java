/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
package com.javamentor.Stepik_02_01_03;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1.01, 2.02, 3.03));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return (Math.abs(a + b - c) < 0.0001);
    }
}
