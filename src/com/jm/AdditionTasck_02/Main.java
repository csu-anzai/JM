package com.jm.AdditionTasck_02;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Snake(),
                new Turtle(),
                new Crocodile(),
                new Hare(),
                new Horse(),
                new Elephant()
        };
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].voice());
            System.out.println(animals[i].go());
            System.out.println();
        }
    }
}
