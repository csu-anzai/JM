/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 * Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный
 * утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
 * является точкой входа в программу, т.е. его никто не вызывал.
 * Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод,
 * откуда сообщение было залогировано.
 */
package com.jm.Stepik_04_01_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }


    public static String getCallerClassAndMethodName() {
//        Throwable t = new Throwable();
//        StackTraceElement[] stackTraceElements = t.getStackTrace();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace(); //стектрейсэлемент всегда наверху стека, поэтому из мейн 3 вызова, из др метода 4 вызова
        if (stackTraceElements.length == 3){ //вызов из main
            return null;
        }
        return stackTraceElements[3].getClassName() + "#" + //вызов из др методов
                stackTraceElements[3].getMethodName();
//        for (int i = 0; i < stackTraceElements.length; i++){
//            System.out.println(stackTraceElements[i]);
//        }
//        System.out.println(stackTraceElements.length);
//        return "eee";
    }
}