package com.jm.Stepik_06_04_04;

public class Salary implements Sendable<Integer>{
    private String from;
    private String to;
    private int salary;

    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}