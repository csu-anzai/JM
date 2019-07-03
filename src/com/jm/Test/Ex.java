package com.jm.Test;

import java.lang.reflect.Array;

public class Ex {
    public static void main(String[] args) {
//        System.out.println(ex(1, 0));

        try {
            int[] a = new int[Integer.MAX_VALUE];

        }
        finally{
            System.out.println("я в finally");
        }

    }
//    public static int ex(int a, int b){
//        int c = 0;
//        try {
//            c = a/b;
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            c = a/b;
//        } catch (Exception e2){
//            System.out.println(e2);
//            System.out.println("не видно");
//        }
//        return c;
//    }




    public static void test (){
        test();
    }
}
