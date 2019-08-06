package com.jm.Stepik_06_04_04;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MailService<T> implements Consumer<T> {
    Map<String, List<T>> myMailBox;

    @Override
    public void accept(T t) {
        myMailBox = new HashMap<String, List<T>>(){
            
        };
     }

    public Map<String, List<T>> getMailBox() {
        return myMailBox;
    }
    // implement here
}
