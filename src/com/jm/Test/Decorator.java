package com.jm.Test;

import java.io.PrintWriter;

public class Decorator {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new Printer("Привет");
        printerInterface.print();
    }

    interface PrinterInterface{
        public void print();
    }

    static class Printer implements PrinterInterface {
        String text;
        Printer (String text){
            this.text = text;
        }

        @Override
        public void print() {
            System.out.println(text);
        }
    }

    class MyDecorator implements PrinterInterface {
        PrinterInterface component;
        MyDecorator(PrinterInterface component){
            this.component = component;
        }

        @Override
        public void print() {
            component.print();
        }
    }
}
