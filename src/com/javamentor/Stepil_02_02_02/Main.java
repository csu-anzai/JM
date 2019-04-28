/**
 * Реализуйте метод, который возвращает букву,
 * стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
package com.javamentor.Stepil_02_02_02;

public class Main {
    public static void main (String[] args) {
        System.out.println(charExpression(29));

    }

    public static char charExpression(int a) {
        char b = '\\';      //берем символ юникода
        System.out.println(b);

        int code = (int) b;     //приводим номер символа к инт
        System.out.println(code);

        int c = (code + a);     //плюсуем расстояние
        System.out.println(c);

        char d = (char)c;       //получаем символ по номеру С

        return d;

    }
}
