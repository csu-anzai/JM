package com.jm.Test;

public class ExceptionTryFinallyReturn {
    public static void main(String[] args) {
        System.out.println(exx());
    }

    public static int exx(){
        try {
            System.out.println("try");
            return 100;
        } finally {
            System.out.println("finally");
            return 101;
        }
    }
}
