package com.jm.Test;

import java.util.*;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Igor", 97000);
        map.put("Vasya", 51000);
        map.put("Petya", 10900);

        Set<String> strings = map.keySet();
        for (String k: strings){
            System.out.println(map.values());
        }
        System.out.println(map.entrySet());

        int salary1 = map.getOrDefault("Igor", 0);
        System.out.println(salary1);

        int salary2 = map.getOrDefault("Elya", -1);
        System.out.println(salary2);

        List<String> list = new ArrayList<>();
        list.add("someContent");

        Map<String, List<String>> map2 = new HashMap<>();

        map2.put("1", list);
        System.out.println(map2);
        System.out.println("----------");

        List<String> list1 = map2.getOrDefault("3", new ArrayList<>());
        list1.add("getContent()");
        map2.put("3", list1);
        System.out.println(map2);

        System.out.println(map2.getOrDefault("4", new ArrayList<>()));
    }
}
