package com.jm.Stepik_06_04_04;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<T>> myMailBox;

    @Override
    public void accept(Sendable<T> t) {
        myMailBox = new HashMap<>();
        List<T> list = new ArrayList<>();
        list.add(t.getContent());
        myMailBox.put(t.getTo(),list);
    }

    public Map<String, List<T>> getMailBox() {

        return myMailBox;
    }
}
