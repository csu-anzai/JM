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
//ВОПРОС: мы создали константу LOGGER и выполняем статические методы. Это как???
    public static final Logger LOGGER_CLASS_A1 = Logger.getLogger("org.stepic.java");
    public static final Logger LOGGER_CLASS_A2 = Logger.getLogger("org.stepic.java.logging.ClassA");

    public static final Logger LOGGER_CLASS_B1 = Logger.getLogger("org.stepic.java");
    public static final Logger LOGGER_CLASS_B2 = Logger.getLogger("org.stepic.java.logging.ClassB"); //лишний??

    public static void main(String[] args) {
        configureLogging();


        //test
        LOGGER_CLASS_A2.finest("FINEST");
        System.out.println();
        LOGGER_CLASS_A2.finer("FINER");
        System.out.println();
        LOGGER_CLASS_A2.fine("FINE");
        System.out.println();
        LOGGER_CLASS_A2.config("CONFIG");
        System.out.println();
        LOGGER_CLASS_A2.info("INFO");
        System.out.println();
        LOGGER_CLASS_A2.warning("WARNING");
        System.out.println();
        LOGGER_CLASS_A2.severe("SEVERE");
    }

    private static void configureLogging() {
//        final Logger LOGGER_CLASS_A = Logger.getLogger("org.stepic.java.logging.ClassA");
//        final Logger LOGGER_CLASS_B = Logger.getLogger("org.stepic.java.logging.ClassB");

        LOGGER_CLASS_A2.setLevel(Level.FINEST); //задаем уровень
        LOGGER_CLASS_B2.setLevel(Level.WARNING);

        LOGGER_CLASS_A1.setLevel(Level.ALL); //задаем уровень для родителя
        LOGGER_CLASS_B1.setLevel(Level.ALL);

        LOGGER_CLASS_A2.setUseParentHandlers(true); //по умолчанию и так в консоль, но на всякий true
        LOGGER_CLASS_B2.setUseParentHandlers(true);



        LOGGER_CLASS_A2.setFilter(new Filter() { //фильтр родителя
            @Override
            public boolean isLoggable(LogRecord record) {
                return false;
            }
        });

        LOGGER_CLASS_B2.setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return false;
            }
        });

        Handler consoleHandlerClassA2 = new ConsoleHandler(); //создаем обработчик
        Handler consoleHandlerClassB2 = new ConsoleHandler();

        consoleHandlerClassA2.setLevel(Level.FINEST); //задаем уровень обработчика
        consoleHandlerClassB2.setLevel(Level.WARNING);

        XMLFormatter xmlFormatter = new XMLFormatter(); //создаем XML форматтер

        consoleHandlerClassA2.setFormatter(xmlFormatter); //устанавливаем форматтер обработчику
        consoleHandlerClassB2.setFormatter(xmlFormatter);

        LOGGER_CLASS_A2.addHandler(consoleHandlerClassA2); //добавляем обработчик логгеру
        LOGGER_CLASS_B2.addHandler(consoleHandlerClassB2);

        LOGGER_CLASS_A2.getParent(); //получаем логгер org.stepic.java.logging
        LOGGER_CLASS_B2.getParent();
    }
}
