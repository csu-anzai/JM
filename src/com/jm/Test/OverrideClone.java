package com.jm.Test;

public class OverrideClone {

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        protected Person clone() throws CloneNotSupportedException {
            Person person2;
            try {
                person2 = (Person) super.clone();
            } catch (CloneNotSupportedException e1){
                throw new AssertionError(e1);
            }
            // Deep clone member fields here

            return person2;
        }


    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Igor", 30);
        person1.clone();

    }
}
