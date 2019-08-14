package com.jm.Test;

public class ObjectClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        MyObj myObj1 = new MyObj();
        myObj1.i = 1;
        myObj1.s = "abc1";
        myObj1.innerObj.j = 2;

        MyObj myObj2 = myObj1.clone();
        myObj2.i = 10;
        myObj2.s = "abc2";
        myObj2.innerObj.j = 20;

        System.out.println(myObj1.i);
        System.out.println(myObj1.s);
        System.out.println(myObj1.innerObj.j);
        System.out.println();
        System.out.println(myObj2.i);
        System.out.println(myObj2.s);
        System.out.println(myObj2.innerObj.j);

    }
}

class MyObj implements Cloneable {
    int i;
    String s;
    InnerObj innerObj = new InnerObj();

    @Override
    protected MyObj clone() throws CloneNotSupportedException {
        MyObj myObj = (MyObj)super.clone();
        myObj.innerObj = innerObj.clone();
        return myObj;
    }
}

class InnerObj implements Cloneable{
    int j;

    @Override
    protected InnerObj clone() throws CloneNotSupportedException {
        return (InnerObj)super.clone();
    }
}
