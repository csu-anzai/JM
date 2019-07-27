/*
Задание:
Известно, что 1 мм осадков - это один литр воды, вылитый на квадратный метр за 12 часов.
Напишите метод static long determineRainfall(double area, double rainfallAmount),
который будет принимать площадь в квадратных километрах и осадки в мм и возвращать
количество выпавших осадков за сутки на этой площади.
Условия:
Метод должен иметь модификатор static
Метод должен принимать в качестве параметров два числа с плавающей точкой
Метод должен возвращать число типа long
Метод не должен ничего выводить в консоль
 */

package com.jm.GitHubTask_07;

public class Main {

    public static void main (String[] args) {
        }
    static long determineRainfall(double area, double rainfallAmount) {
        area = area*1000000;                        //из км2 в м2
        double litres = 2*(area*rainfallAmount);    //умножаем на 2 т.к. литры за сутки а не за 12ч
        return (long)litres; //явное преобразование
    }

}
