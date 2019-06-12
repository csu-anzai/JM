package com.jm.Stepik_03_04_01;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        ComplexNumber c = new ComplexNumber(1,1);

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

    @Override
    public boolean equals(Object obj) {
        //проверка ссылок на объекты
        if (this == obj) {
            return true;
        }
        //проверка на null
        if (obj == null) {
            return false;
        }
        //проверка класса
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        //проверка полей
        ComplexNumber d = (ComplexNumber) obj;
        if (this.im != d.im) {
            return false;
        }
        if (this.re != d.re) {
            return false;
        }
        return true;
    }
//    @Override
//    public int hashCode(){
//        final int jo = 17;
//        double result = 1;
//        result = result * jo + im;
//        result = result * jo + re;
//        return (int) result;
//    }
    @Override
    public int hashCode() {
        return (int)((Double.doubleToLongBits(re)) - (Double.doubleToLongBits(re) >>> 32));
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ComplexNumber that = (ComplexNumber) o;
//        return Double.compare(that.re, re) == 0 &&
//                Double.compare(that.im, im) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(re, im);
//    }
}

