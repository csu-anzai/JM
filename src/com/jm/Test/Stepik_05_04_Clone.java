package com.jm.Test;

public class Stepik_05_04_Clone {


    public static void main(String[] args) throws CloneNotSupportedException {

        MyObject myObject1 = new MyObject();
        myObject1.i = 1;
        myObject1.innerObject.j = 2;

        MyObject myObject2 = myObject1.clone();

        myObject2.i = 10;
        myObject2.innerObject.j = 20;

        System.out.println(myObject1.i);
        System.out.println(myObject1.innerObject.j);
        System.out.println();
        System.out.println(myObject2.i);
        System.out.println(myObject2.innerObject.j);


    }
}

class MyObject implements Cloneable{
    int i;
    InnerObject innerObject = new InnerObject();

    @Override
    public MyObject clone() throws CloneNotSupportedException {
        MyObject myObject = (MyObject)super.clone();
        myObject.innerObject = innerObject.clone();
        return myObject;
    }
}

class InnerObject implements Cloneable{
    int j;

    @Override
    public InnerObject clone() throws CloneNotSupportedException {
        return (InnerObject)super.clone();
    }
}