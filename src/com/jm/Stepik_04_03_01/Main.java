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

import java.util.logging.*;

public class Main {

    public static final Logger LOGGER_CLASS_A = Logger.getLogger(ClassA.class.getName());
    public static final Logger LOGGER_CLASS_B = Logger.getLogger(ClassB.class.getName());

    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        LOGGER_CLASS_A.setLevel(Level.FINEST); //задаем уровень
        LOGGER_CLASS_B.setLevel(Level.WARNING);

        LOGGER_CLASS_A.setUseParentHandlers(true); //по умолчанию всегда в консоль
        LOGGER_CLASS_B.setUseParentHandlers(true);

        Handler consoleHandlerClassA = new ConsoleHandler(); //создаем обработчик
        Handler consoleHandlerClassB = new ConsoleHandler();

        consoleHandlerClassA.setLevel(Level.FINEST); //задаем уровень обработчика
        consoleHandlerClassA.setLevel(Level.WARNING);
//        consoleHandlerClassA.setFormatter(XMLFormatter);
//        consoleHandlerClassB.setFormatter(XMLFormatter);

        LOGGER_CLASS_A.addHandler(consoleHandlerClassA); //добавляем обработчик логгеру
        LOGGER_CLASS_B.addHandler(consoleHandlerClassB);
    }


}
