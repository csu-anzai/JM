package com.jm.Test;

public class Stepik_05_04_Clone {


    public static void main(String[] args) throws CloneNotSupportedException {

        MyObj myObj1 = new MyObj();
        myObj1.i = 1;
        myObj1.s = "abc1";

        MyObj myObj2 = myObj1.clone();
        myObj2.i = 10;
//        myObj2.s = "abc";

        System.out.println(myObj1.s == myObj2.s);
        System.out.println(myObj1.i);
        System.out.println(myObj1.s);
        System.out.println(myObj2.i);
        System.out.println(myObj2.s);

    }
}

class MyObj implements Cloneable {
    int i;
    String s = "abc";
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
