/**
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным
 * с реализацией equals().
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 */

package com.jm.Stepik_03_04_01;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        ComplexNumber c = new ComplexNumber(1, 1);

        System.out.println("equals " + a.equals(b));
        System.out.println("");

        System.out.println("hashCode " + (a.hashCode() == b.hashCode()));
        System.out.println("");

        System.out.println("a " + a.hashCode());
        System.out.println("b " + b.hashCode());
        System.out.println("");

        //reflexive
        System.out.println("reflexive");
        System.out.println(a.equals(a)); //true
        System.out.println("");

        //symmetric
        System.out.println("symmetric");
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println("");

        //transitive
        System.out.println("transitive");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));
        System.out.println("");

        //consistent
        System.out.println("consistent");
        System.out.println(a.equals(b));
        System.out.println(a.equals(b));
        System.out.println(a.equals(b));
        System.out.println(a.equals(b));
        System.out.println("");

        //non-null
        System.out.println("non-null");
        System.out.println(a.equals(null)); //false
        System.out.println(b.equals(null)); //false
        System.out.println("");

    }


}
