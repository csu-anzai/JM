package com.jm.Test;

import java.math.BigDecimal;

public class CompareToDouble {
    static double d1 = 0.22;
    static double d2 = 0.220000000000000000000000000000000000001;

    BigDecimal bd1 = new BigDecimal(d1);
    BigDecimal bd2 = new BigDecimal(d2);

//    public CompareToDouble(double d1, double d2){
//        this.d1 = d1;
//        this.d2 = d2;
//    }

    public static void main(String[] args) {
        CompareToDouble a = new CompareToDouble();
        System.out.println(a.bd1);
        System.out.println(a.bd2);

        System.out.println(a.bd1.compareTo(a.bd2));
        System.out.println(d1 > d2);
    }
}
