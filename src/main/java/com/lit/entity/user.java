package com.lit.entity;

public class User {
    // All are set to final to make Picture Immutable
    private final int userId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;

    // Constructor is private, so that only static
    // UserBuidler can initiate the UserPicture class instance
    private User(User.UserBuilder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    // getters
    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static class UserBuilder
    {
        private int userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        // Multiple Constructors for each member variable
        public User.UserBuilder userId(int userId)
        {
            this.userId = userId;
            return this;
        }

        public User.UserBuilder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public User.UserBuilder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public User.UserBuilder email(String email)
        {
            this.email = email;
            return this;
        }

        public User.UserBuilder password(String password)
        {
            this.password = password;
            return this;
        }

    }
}

