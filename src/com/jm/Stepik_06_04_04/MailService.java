package com.jm.Stepik_06_04_04;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<T>> myMailBox;

    Map<String, List<T>> getMailBox() {
        myMailBox = new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key) {
                return super.getOrDefault(key, new LinkedList<>());
            }
        };
        return myMailBox;
    }

    @Override
    public void accept(Sendable<T> t) {
        List<T> list = myMailBox.getOrDefault(t.getTo(), new LinkedList<>());
        list.add(t.getContent());
        myMailBox.put(t.getTo(), list);
    }
}
