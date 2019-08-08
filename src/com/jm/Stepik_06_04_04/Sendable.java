package com.jm.Stepik_06_04_04;

public interface Sendable<T> {
    String getTo();
    T getContent();
}
