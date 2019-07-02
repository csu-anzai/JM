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

    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        final Logger LOGGER = Logger.getLogger("org.stepic.java");
        final Logger LOGGER_CLASS_A = Logger.getLogger("org.stepic.java.logging.ClassA");
        final Logger LOGGER_CLASS_B = Logger.getLogger("org.stepic.java.logging.ClassB");

        LOGGER_CLASS_A.setLevel(Level.ALL); //задаем уровень логгера
        LOGGER_CLASS_B.setLevel(Level.WARNING);

        LOGGER_CLASS_A.setUseParentHandlers(true); //разрешаем передавать сообщение родителю
        LOGGER_CLASS_B.setUseParentHandlers(true);

        LOGGER.setUseParentHandlers(false); //запрещаем передавать сообщение родителю

        LOGGER.setLevel(Level.ALL); //задаем уровень логгера

        Handler consoleHandlerLogger = new ConsoleHandler(); //создаем обработчик

        consoleHandlerLogger.setLevel(Level.ALL); //задаем уровень для обработчика

        XMLFormatter xmlFormatter = new XMLFormatter(); //создаем XML форматтер

        consoleHandlerLogger.setFormatter(xmlFormatter); //устанавливаем форматтер обработчику

        LOGGER.addHandler(consoleHandlerLogger); //добавляем обработчик логгеру
    }
}