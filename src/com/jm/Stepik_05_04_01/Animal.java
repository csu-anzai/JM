package com.jm.Stepik_05_04_01;

import java.io.Serializable;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
//            return Object.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}