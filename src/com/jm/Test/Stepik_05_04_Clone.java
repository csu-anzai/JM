package com.jm.Test;

public class Stepik_05_04_Clone {


    public static void main(String[] args) throws CloneNotSupportedException {

        FirstObject firstObject = new FirstObject();
        firstObject.i = 1;
        firstObject.secondObject.j = 2;

        FirstObject firstObject1 = firstObject.clone();
        firstObject1.i = 10;
        firstObject1.secondObject.j = 20;

        System.out.println(firstObject.i);
        System.out.println(firstObject.secondObject.j);
        System.out.println();
        System.out.println(firstObject1.i);
        System.out.println(firstObject1.secondObject.j);

    }
}

class FirstObject implements Cloneable {
    int i;
    SecondObject secondObject = new SecondObject();

    @Override
    protected FirstObject clone() throws CloneNotSupportedException {
        FirstObject firstObject = (FirstObject) super.clone();
        firstObject.secondObject = secondObject.clone();
        return firstObject;
    }
}

class SecondObject implements Cloneable {
    int j;

    @Override
    protected SecondObject clone() throws CloneNotSupportedException {
        return (SecondObject) super.clone();
    }
}