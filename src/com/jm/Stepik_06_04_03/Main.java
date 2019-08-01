/*
Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в
конце выводящую 10 наиболее часто встречающихся слов.
Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке
"Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово. Выводите
слова в нижнем регистре.
Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то
дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.
Sample Input 1:
Мама мыла-мыла-мыла раму!
Sample Output 1:
мыла
мама
раму
Sample Input 2:
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,
tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus
imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur
adipiscing elit. Integer vel odio nec mi tempor dignissim.
Sample Output 2:
consectetur
faucibus
ipsum
lorem
adipiscing
amet
dolor
eget
elit
mi
 */

package com.jm.Stepik_06_04_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        //получаем поток
        Charset charset = StandardCharsets.UTF_8;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in, charset);
        BufferedReader reader = new BufferedReader(inputStreamReader);

//        List<String> list = new ArrayList<>();
//        while (true) {
//            list.add(reader.readLine());
//            System.out.println(list.toString());
//        }
//        Stream<String> stringStream = reader.lines();
//        stringStream.filter(s -> s.length() > 4)
////                .peek(s -> s.)
//                .map(String::toLowerCase)
//                .forEach(System.out::println);

//        Stream.of(new Scanner(System.in, charset).nextLine().split("\\s+"))
//                .filter(s -> s.matches("[^A-Za-zА-Яа-я0-9]")

//        Stream<String> stringStream = reader.lines();
//        stringStream.filter(s -> s.matches("[^A-Za-zА-Яа-я0-9] "))
////                .map(String::toLowerCase)
//                .forEach(System.out::println);

//        Scanner scanner = new Scanner(System.in, charset);
//        Stream<String> stringStream = scanner.tokens();
//        stringStream.filter(s -> s.matches("[^A-Za-zА-Яа-я0-9] ")
//                Stream.of(scanner).nextLine().split("\\s+"))
//                .filter(s -> s.matches("[^A-Za-zА-Яа-я0-9] ")

        //получаем стрим из потока и разбиваем строку
        Stream<String> stringStream = reader.lines();
        List<String> list1 = stringStream
                .map(String::toLowerCase)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .flatMap(s -> Arrays.stream(s.split("-")))
                .flatMap(s -> Arrays.stream(new String[]{s.replaceAll("[^A-Za-zА-Яа-я0-9]", "")}))
                .collect(Collectors.toList());

        System.out.println(list1.toString());



    }
}

