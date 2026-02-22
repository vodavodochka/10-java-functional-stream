package com.example.task05;

public interface IMessage<T> {
    String getTo();

    String getFrom();

    T getContent();
}
