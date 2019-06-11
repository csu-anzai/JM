package com.jm.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Boolean[] booleans = new Boolean[3];

        System.out.println(Arrays.toString(booleans));

        System.out.println(Arrays.toString(m.boolIn(booleans)));

    }

    public Boolean[] boolIn(Boolean[] b){
        for (int i = 0; i < b.length; i++){
            b[i] = true;
        }return b;
    }

//    private public class Person(){
//        String name;
//    }
//
//    protected class Animals(){
//
//    }
//
//    private class Job(){
//
//    }
//
//    class Car(){
//
//    }
//
//    static class Cat(){
//
//    }
}






