package com.jm.Stepik_04_02_01;

public class Robot implements RobotConnection, RobotConnectionManager {
    private String name;
    private int age;

//    Robot(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}
