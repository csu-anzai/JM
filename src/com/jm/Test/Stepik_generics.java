package com.jm.Test;

import java.util.Optional;

public class Stepik_generics<X> {


    public static void main(String[] args) {
        Stepik_generics<String> a = new Stepik_generics<>();
        BB b = new BB("R");
        a.someMethod(b);
    }

    public void someMethod(Object object){
//        boolean q = (object instanceof<String>);
//        boolean q2 = (object Optional<String>);
//        X rr = (X) object;

    }
    public static class BB{
        String name;
        BB(String name){
            this.name = name;
        }
    }
}
