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
    private static int stolenValue = 0; //сумма сворованного

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if ((mail instanceof MailPackage) & (minPrice < ((MailPackage) mail).getContent().getPrice())) {
            stolenValue += ((MailPackage) mail).getContent().getPrice();
            return new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of" + ((MailPackage) mail).getContent().getContent(), 0));
        } else {
            if (mail instanceof MailMessage) {
                return mail;
            } else {
                return mail;
            }
        }
    }

    public int getStolenValue() {
        return stolenValue;
    }
}