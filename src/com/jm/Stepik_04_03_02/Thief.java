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

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }

    Thief (int minPrice){
        this.minPrice = minPrice;
    }

    public int getStolenValue(){
        return 0;
    }
}
