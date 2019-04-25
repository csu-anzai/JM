/**
 * В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100,
 * либо кратен 400.
 * Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года
 * включительно. На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения
 * мы распространяем его действие на всю нашу эру.
 * Ввод-вывод обеспечивает проверяющая система. Вам надо только проанализировать переданное в метод значение
 * и вернуть результат. В программу всегда подается положительный номер года. Предполагается решение без циклов.
 * Вам надо придумать и записать несложную формулу, использующую только арифметические операторы.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
package com.javamentor.Stepik_02_1_7;

public class Main {
    public static void main(String[] args) {

    }

    public static int leapYearCount(int year) {

//        float a = (float)year;      //из int во float
//
//        float b = a % 4;            //берем остаток от деления на 4
//        float c = a % 100;          //берем остаток от деления на 100
//
//        float d = a % 400;          //берем остаток от деления на 400
//
//        if ((b == 0) & (c != 0) | (d == 0)) {
//            return
//        }
        return (year - (year % 4)) / 4 - (year - (year % 100)) / 100 + (year - (year % 400)) / 400; //смотрел комменты
    }
}
