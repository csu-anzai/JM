/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
package com.javamentor.Stepik_02_1_11;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean doubleExpression(double a, double b, double c) {
//        BigDecimal bigDecimalA = BigDecimal.valueOf(a);
//        BigDecimal bigDecimalB = BigDecimal.valueOf(b);
//        BigDecimal bigDecimalC = BigDecimal.valueOf(c);
//
//        BigDecimal bigDecimalD = bigDecimalA.add(bigDecimalB);

        float A = (float) a;        //подглядел насчет float
        float B = (float) b;
        float C = (float) c;
        float D = A + B;

        if (D == C) {
            return true;
        } else {
            return false; 
        }
    }
}
