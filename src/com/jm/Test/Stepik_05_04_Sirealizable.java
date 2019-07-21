package com.jm.Test;

public class Stepik_05_04_Sirealizable {

    public static class Person {
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Igor", 30);

    }
}
