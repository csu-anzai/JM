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
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
//        System.out.println(LOGGER);

    }

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static void anotherMethod(){
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName(){
        Throwable t = new Throwable();
//        System.out.println(t.getCause());
//        System.out.println(t.fillInStackTrace());
//        System.out.println(t.getLocalizedMessage());
//        System.out.println(t.getSuppressed());
//        System.out.println(t.getStackTrace());
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        String className = stackTraceElements[1].getClassName();
//        System.out.println(className);

        String methodName = stackTraceElements[2].getMethodName();
//        System.out.println(methodName);

        String message = className + "." + methodName;
//        return Arrays.toString(stackTraceElements);
//        return LOGGER.toString();
//        return t.getMessage();
        return message;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
