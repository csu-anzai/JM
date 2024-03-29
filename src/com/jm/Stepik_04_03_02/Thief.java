package com.jm.Stepik_04_03_02;

/**
 * 3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе
 * переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен
 * присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.
 * Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с
 * нулевой ценностью и содержимым посылки "stones instead of {content}".
 */
public class Thief implements MailService {

    private int minPrice;
    private int stolenValue; //сумма сворованного

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage newMail = (MailPackage) mail;
            Package contentMailPackage = newMail.getContent();
            int pricePackage = contentMailPackage.getPrice();
            String contentPackage = contentMailPackage.getContent();
            if (minPrice <= pricePackage) {
                Package newPackage = new Package("stones instead of " + contentPackage, 0);
                stolenValue += pricePackage;
                return new MailPackage(newMail.getFrom(), newMail.getTo(), newPackage);
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return stolenValue;
    }
}
