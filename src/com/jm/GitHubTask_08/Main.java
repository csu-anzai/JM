/**
 * Задание:
 * В методе main напишите программу, которая будет спрашивать имя пользователя и здороваться с ним.
 * При запуске программа должна выводить в консоль “Как вас зовут?”,после чего ожидать ввода имени пользователя.
 * После ввода имени программа должна выводить в консоль “Здравствуйте {username}!”
 * (Где вместо {username} имя пользователя) и завершаться.
 * Для принятия ответа от пользователя воспользуйтесь классом Scanner из стандартной библиотеки.
 */
package com.jm.GitHubTask_08;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner readFromConsole = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = readFromConsole.nextLine();
        System.out.println("Здравствуйте" + " " + name);

    }


}

