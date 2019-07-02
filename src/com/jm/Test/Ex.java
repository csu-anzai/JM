package com.jm.Test;

public class Ex {
    public static void main(String[] args) {
        System.out.println(ex(1, 0));

    }
    public static int ex(int a, int b){
        int c = 0;
        try {
            c = a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e2){
            System.out.println(e2);
        }
        return c;

    }
}
