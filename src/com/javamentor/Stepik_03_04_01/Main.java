/**
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным
 * с реализацией equals().
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 */

package com.javamentor.Stepik_03_04_01;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }


}
