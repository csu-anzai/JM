package com.jm.Stepik_04_03_02;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 2) Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется
 * от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса
 * MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить части в фигурных скобках на значения
 * полей почты):
 * 2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с уровнем
 * WARN: Detected target mail correspondence: from {from} to {to} "{message}"
 * 2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
 */
public class Spy implements MailService {

    private static Logger LOGGER;
    public static final String AUSTIN_POWERS = "Austin Powers";

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        if (AUSTIN_POWERS.contains(message.getFrom()) | AUSTIN_POWERS.contains(message.getTo())){   //как получить сообщение
            LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {message.getFrom()} to {message.getTo()} \"{message}\"", new Object[] {mail.getFrom(), mail.getTo(), message.getMessage()});
        } else {
            LOGGER.log(Level.INFO, "Usual correspondence: from {message.getFrom} to {message.getTo}", new Object[] {message.getFrom(), message.getTo()});
        }

        return mail;
    }


}
