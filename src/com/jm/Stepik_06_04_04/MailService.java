package com.jm.Stepik_06_04_04;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    Map<String, List<T>> myMailBox = new HashMap<>();

    Map<String, List<T>> getMailBox() {
        myMailBox = new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key) {
//                if (myMailBox.containsKey(key)) {
//                    return myMailBox.get(key);
//                } else {
//                    return new LinkedList<>();
//                }
                List<T> list5 = getOrDefault(key, new LinkedList<>());
                list5 = new LinkedList<>(list5);

                return list5;
            }
        };
        return myMailBox;
    }

    @Override
    public void accept(Sendable<T> t) {
//        if (myMailBox.containsKey(t.getTo())) {
//            List<T> list1 = myMailBox.get(t.getTo());
//            list1 = new LinkedList<>(list1);
//            list1.add(t.getContent());
//            myMailBox.put(t.getTo(), list1);
//        } else {
//            List<T> list2 = new LinkedList<>();
//            list2.add(t.getContent());
//            myMailBox.put(t.getTo(), list2);
//        }
//        ArrayList<T> aList = new ArrayList<>();
//        List<T> list = myMailBox.getOrDefault(t.getTo(), new ArrayList<>());

//        List<T> list3 = new LinkedList<>();
//        list3 = myMailBox.get(t.getTo());
//        List<T> list4 = new ArrayList<T>((Collection<? extends T>) Arrays.asList(list3));
//        myMailBox.put(t.getTo(), list4);

        List<T> list = myMailBox.getOrDefault(t.getTo(), new LinkedList<>());
        list = new LinkedList<>(list);
        list.add(t.getContent());
        myMailBox.put(t.getTo(), list);
    }
}