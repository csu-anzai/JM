package com.jm.Test;

public class Decorator {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет"))));
        printerInterface.print();
    }

    interface PrinterInterface {
        void print();
    }

    static class Printer implements PrinterInterface {
        String text;
        Printer (String text) {
            this.text = text;
        }

        @Override
        public void print() {
            System.out.print(text);
        }
    }

    static class QuotesDecorator implements PrinterInterface {
        PrinterInterface component;
        QuotesDecorator(PrinterInterface component){
            this.component = component;
        }

        @Override
        public void print() {
            System.out.print("\"");
            component.print();
            System.out.print("\"");

        }
    }

    static class LeftBracketDecorator implements PrinterInterface {
        PrinterInterface component;
        LeftBracketDecorator(PrinterInterface component){
            this.component = component;
        }

        @Override
        public void print() {
            System.out.print("[");
            component.print();

        }
    }

    static class RightBracketDecorator implements PrinterInterface {
        PrinterInterface component;
        RightBracketDecorator(PrinterInterface component){
            this.component = component;
        }

        @Override
        public void print() {
            component.print();
            System.out.print("]");

        }
    }
}
