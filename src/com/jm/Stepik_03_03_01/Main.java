/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз,
 * направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */

package com.jm.Stepik_03_03_01;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 33, -4);
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() < toX) {
            while (robot.getDirection() != Robot.Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getX() > toX) {
            while (robot.getDirection() != Robot.Direction.LEFT) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() < toY) {
            while (robot.getDirection() != Robot.Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() > toY) {
            while (robot.getDirection() != Robot.Direction.DOWN) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }
}