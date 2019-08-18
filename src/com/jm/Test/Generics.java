package com.jm.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //как решить проблему с выозовм второго метода не прибегая к решению с строки которая помечена *
        //И это не параметризация объекта Gen
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Gen gen = new Gen();
        Gen<?> gen1 = new Gen<>();//*
        gen.m(integerList);
        gen1.m(integerList);
    }
    static class Gen<T> {
        <T> void m(Collection<T> collection) {
            for (T s : collection) {
                System.out.println(s);
            }
        }
        <T> void m(List<Integer> list) { //Тип должен соответствовать типу класса
            for (Integer s : list) {
                System.out.println(s);
            }
        }
    }
}
