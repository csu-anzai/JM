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
        return (char)(((int)'\\') + a);     //записал в одну строку
    }
}

//        char b = '\\';      //берем символ юникода
//        System.out.println(b);
//
//        int code = (int) b;     //приводим номер символа к инт
//        System.out.println(code);
//
//        int c = (code + a);     //плюсуем расстояние
//        System.out.println(c);
//
//        char d = (char)c;       //получаем символ по номеру С