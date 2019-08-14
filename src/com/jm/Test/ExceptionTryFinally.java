package com.jm.Test;

public class ExceptionTryFinally {
    public static void main(String[] args) {
        try {
            int[] a = new int[Integer.MAX_VALUE];
        }
        finally{
            System.out.println("я в finally");
        }
    }
    public static void test (){
        test();
    }
}
