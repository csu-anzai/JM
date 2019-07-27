/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз,
направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */

package com.jm.Stepik_03_03_01;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 33, -4);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

//        while (robot.getX() < toX) {
//            while (robot.getDirection() != Robot.Direction.RIGHT) {
//                robot.turnRight();
//            }
//            robot.stepForward();
//        }
//        while (robot.getX() > toX) {
//            while (robot.getDirection() != Robot.Direction.LEFT) {
//                robot.turnRight();
//            }
//            robot.stepForward();
//        }
//        while (robot.getY() < toY) {
//            while (robot.getDirection() != Robot.Direction.UP) {
//                robot.turnRight();
//            }
//            robot.stepForward();
//        }
//        while (robot.getY() > toY) {
//            while (robot.getDirection() != Robot.Direction.DOWN) {
//                robot.turnRight();
//            }
//            robot.stepForward();
//        }

        if (robot.getX() < toX){
            rotate(robot, Robot.Direction.RIGHT);
            go(robot, toX - robot.getX());
        } else {
            rotate(robot, Robot.Direction.LEFT);
            go(robot, robot.getX() - toX);
        }
        if (robot.getY() < toY){
            rotate(robot, Robot.Direction.UP);
            go(robot, toY - robot.getY());
        } else {
            rotate(robot, Robot.Direction.DOWN);
            go(robot, robot.getY() - toY);
        }
    }
    public static void rotate(Robot robot, Robot.Direction d){
        while (robot.getDirection() != d){
            robot.turnRight();
        }
    }
    public static void go(Robot robot, int a){
        for (int i = 0; i < a; i++){
            robot.stepForward();
        }
    }
}