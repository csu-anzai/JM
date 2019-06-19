/**
 * В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет
 * выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.
 * Требуется выставить такие настройки, чтобы:
 * Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
 * Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
 * Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности сообщения
 * печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях "org.stepic", "org" и "".
 * Не упомянутые здесь настройки изменяться не должны.
 * (*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает
 * создавать файлы на диске, поэтому придется так.
 * Подсказки:
 * Level есть не только у Logger, но и у Handler.
 * Передача сообщения на обработку родительскому Handler'у регулируется свойством useParentHandlers.
 */

package com.jm.Stepik_04_03_01;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
    }

    private static void configureLogging() {
        final Logger LOGGER1 = Logger.getLogger(ClassA.class.getName());
        final Logger LOGGER2 = Logger.getLogger(ClassB.class.getName());

        LOGGER1.log(Level.ALL, "Current value of x is {0}", x);
        LOGGER2.log(Level.WARNING, "Current value of x is {0}", x);

        ConsoleHandler consoleHandler1 = new ConsoleHandler();
        ConsoleHandler consoleHandler2 = new ConsoleHandler();

        LOGGER1.addHandler(consoleHandler1);
        LOGGER1.addHandler(consoleHandler2);
    }


}
