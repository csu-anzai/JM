package com.javamentor.Stepik_02_02_01;

/**
 * Реализуйте метод, который возвращает букву,
 * стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */

public class Main {
    public static void main (String[] args) {
        System.out.println(charExpression(1));
    }

    public static char charExpression(int a) {
        return (char)('\\' + a);     //записал в одну строку
    }
}
