package com.javamentor.Stepik_02_01_03;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1.01, 2.02, 3.03));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }
}
//        double sum = a + b;
//        double e = 0.0001;
//        boolean d = false;
//        if (a + b - c) {
//            d = true;
//        }
//       return d;
//    }
//}
//        BigDecimal aa = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);
//        BigDecimal bb = new BigDecimal(b).setScale(4, RoundingMode.HALF_UP);
//        BigDecimal cc = new BigDecimal(c).setScale(4, RoundingMode.HALF_UP);
//
//        BigDecimal sum = aa.add(bb);
//
//        boolean boo = false;
//        int comp = sum.compareTo(cc);
//        if (comp == 0) {
//            boo = true;
//        }
//        return boo;
//    }
//}

//        BigDecimal bigDecimalA = BigDecimal.valueOf(a);
//        BigDecimal bigDecimalB = BigDecimal.valueOf(b);
//        BigDecimal bigDecimalC = BigDecimal.valueOf(c);
//
//        BigDecimal bigDecimalD = bigDecimalA.add(bigDecimalB);
//
//
//
//        float A = (float) a;        //подглядел насчет float
//        float B = (float) b;
//        float C = (float) c;
//        float D = A + B;
//
//
//        if (D == C) {
//            return true;
//        } else {
//            return false;
//        }
//        return true;
//
//    }
//}
