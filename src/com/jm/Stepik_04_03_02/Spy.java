package com.jm.Stepik_04_03_02;

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

    private Logger LOGGER;
    public static final String AUSTIN_POWERS = "Austin Powers";

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage){
            MailMessage newMail = (MailMessage) mail;
            if (newMail.getFrom().contains(AUSTIN_POWERS) || newMail.getTo().contains(AUSTIN_POWERS)){
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[] {newMail.getFrom(), newMail.getTo(), newMail.getMessage()});
            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[] {newMail.getFrom(), newMail.getTo()});
            }
        }
        return mail;
    }
}
