package com.designpatterns.iterator;

public class User {
    private String username;
    private Integer userId;
    
    public User(String username, Integer userId) {
        this.username = username;
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
