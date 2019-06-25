package com.jm.Stepik_04_03_02;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public static interface MailService {
    Sendable processMail(Sendable mail);
}
