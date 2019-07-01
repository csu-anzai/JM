package com.jm.Stepik_04_03_02;

/**
 * 4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
 * если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
 * ("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из камней
 * (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны объявить
 * самостоятельно в виде непроверяемых исключений.
 */
public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage newMailPackage = (MailPackage) mail;
            String content = newMailPackage.getContent().getContent();
            if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            } else if (content.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}