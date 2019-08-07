package com.jm.Stepik_06_04_04;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MailService<T> implements Consumer <Sendable<T>> {
    Map<String, List<T>> myMailBox = new HashMap<>();

    @Override
    public void accept(Sendable<T> t) {
        myMailBox.put();
     }

    public Map<String, List<T>> getMailBox() {
        return myMailBox;
    }
    // implement here
}
