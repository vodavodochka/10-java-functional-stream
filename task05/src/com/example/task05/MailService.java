package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMessage<T>> {

    private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    @Override
    public void accept(IMessage<T> message) {
        mailBox
                .computeIfAbsent(message.getTo(), key -> new ArrayList<>())
                .add(message.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
