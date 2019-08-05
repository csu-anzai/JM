package com.jm.Stepik_06_04_04;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MailService<T> implements Consumer {
    Map<String, List<T>> myMailBox;

    @Override
    public void accept(Main.Sendable<T> sendable) {
        myMailBox.entrySet().stream()
                .collect(Collectors.toMap(Main.Sendable::getTo, Main.Sendable::getContent);
    }

    public Map<String, List<T>> getMailBox() {
        return myMailBox;
    }
    // implement here
}