package com.jm.Stepik_04_03_02;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public interface MailService {
    Sendable processMail(Sendable mail) throws Throwable;
}
