package com.designpatterns.builder;

public class ModifiedUser {

    private String userId;
    private String userName;
    private String emailId;

    private ModifiedUser(UserBuilder builder) {
        userId = builder.userId;
        userName = builder.userName;
        emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String toString() {
        return userName +" : "+ userId + " : " + emailId;
    }

    // inner class to create object
    public static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        private UserBuilder(){
            // restrict object creation from outside class
        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public ModifiedUser build(){
            return new ModifiedUser(this);
        }
    }
}
