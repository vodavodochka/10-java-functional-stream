package com.example.task05;

public class Salary implements IMessage<Integer>{

    private final String from;
    private final String to;
    private final int salary;

    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    @Override
    public String getTo() {
        return this.to;
    }

    @Override
    public String getFrom() {
        return this.from;
    }

    public Integer getContent(){
        return this.salary;
    }
}
