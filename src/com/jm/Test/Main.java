package com.jm.Test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        Main.Inner1 inner1 = m.new Inner1();
        Main.Inner2 inner2 = m.new Inner2();
        Main.Inner3 inner3 = m.new Inner3();
        Main.Inner4 inner4 = m.new Inner4();

        System.out.println(inner4.y);
        System.out.println(inner4.t);
        inner4.y = 7;
        inner4.t = 10;
        System.out.println(inner4.y);
        System.out.println(inner4.t);

        inner3.printInfo();

    }

    int x = 4;
    private int r = 0;

    public class Inner1{
        String s;
    }

    protected class Inner2{
        double d = 1.0;
        void printInfo(){
            System.out.println(d);
        }
    }

    class Inner3 extends Inner2{
        byte b = 3;

        @Override
        void printInfo() {
            super.printInfo();
        }
    }

    private class Inner4{
        int y = 5;
        private int t = 8;




    }
}






