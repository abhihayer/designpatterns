package com.designpatterns;

import com.designpatterns.builder.User;
import com.designpatterns.builder.ModifiedUser;

public class UseBuilder {
// Technique used here is called method chaining

    public static User useBuilder(){
        User user = new User.UserBuilder()
        .setEmailId("jamesbond@gmail.com")
        .setUserId("OO7")
        .setUserName("Bond")
        .build();
        return user;
    }

    public static ModifiedUser useBuilderModified(){
        ModifiedUser modifiedUser = ModifiedUser.UserBuilder.builder()
        .setEmailId("ethenhunt@gmail.com")
        .setUserId("0001")
        .setUserName("Hunt")
        .build();

        return modifiedUser;
    }
}
