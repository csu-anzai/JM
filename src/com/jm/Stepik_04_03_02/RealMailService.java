package com.jm.Stepik_04_03_02;

/*
Класс, в котором скрыта логика настоящей почты
*/
public class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        System.out.println("Это реальная почтовая служба:" + " " + mail.getFrom() + " to " + mail.getTo());
        return mail;
    }
}
