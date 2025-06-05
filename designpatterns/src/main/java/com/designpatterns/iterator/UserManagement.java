package com.designpatterns.iterator;

import java.util.List;
import java.util.ArrayList;

public class UserManagement {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public CustomIterator<User> getCustomIterator() {
        return new ConcreteCustomIterator<>(users);
    }
}
