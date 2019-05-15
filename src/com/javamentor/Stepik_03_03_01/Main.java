/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз,
 * направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */

package com.javamentor.Stepik_03_03_01;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();


            System.out.println(robot.getDirection() == Robot.Direction.UP);


        }


    public static void moveRobot(Robot robot, int toX, int toY) {


        if (robot.getY() == 0) {
            if (robot.getDirection() == Robot.Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Robot.Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Robot.Direction.DOWN) {
                robot.turnLeft();
            } else {
                for (int i = robot.getX(); i < toX; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}
