/**
 * Задание:
 * Создайте класс Human, содержащий поля String name и int age.
 * У класса Human должен быть метод void sayHello(),
 * который выводит в консоль, “Привет, меня зовут {name}, мне {age} лет.”.
 * В методе main создайте объект класса Human, заполните его поля и вызовите метод sayHello().
 * Условия:
 * Класс Human должен иметь поля String name и int age
 * Метод sayHello() не должен ничего возвращать
 * В методе main должен быть создан объект класса Human
 * Поля объекта должны быть заполнены
 * У объекта класса human должен быть вызван метод sayHello()
 */

package com.javamentor.Task012;

public class Main {
    public static void main (String[] args) {
        Human human = new Human();
        human.name = "Igor";
        human.age = 30;
        human.sayHello();
    }

    public static class Human {     //не до конца понял почему класс IDEA посоветовала сделать static
        private String name;        //знаю что private не требовалось
        private int age;            //аналогично

        void sayHello() {
            System.out.println("Привет, меня зовут" + " " + name + "," + " " + "мне" + " " + age + " " + "лет.");
        }
    }
}
