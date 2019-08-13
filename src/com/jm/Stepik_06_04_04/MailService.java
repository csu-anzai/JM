package com.jm.Stepik_06_04_04;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<T>> myMailBox = new HashMap<>();
    List<T> myList = new ArrayList<>();

    Map<String, List<T>> getMailBox() {

        Map<String, List<T>> box = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                if (myMailBox.containsKey(key)){
                    return myMailBox.get(key);
                } else {
                    myMailBox.put((String) key, new ArrayList<>());
                    return myMailBox.get(key);
                }
            }
        };

        return box;
    }

    @Override
    public void accept(Sendable<T> t) {
        if (myMailBox.containsKey(t.getTo())){
            myList = myMailBox.get(t.getTo());
            myList.add(t.getContent());
            myMailBox.put(t.getTo(), myList);
        } else {
            myList = new ArrayList<>();
            myList.add(t.getContent());
            myMailBox.put(t.getTo(), myList);
        }
    }
}