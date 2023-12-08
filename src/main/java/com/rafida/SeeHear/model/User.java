package com.rafida.SeeHear.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//instances of this class will be stored in a MongoDB collection named "users"
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;

    // Constructors, getters, setters

    // Constructors
    // initializes an object of the User class with default values
    public User() {
        // Default constructor
    }
    //A parameterized constructor (public User(String username, String password))
    //that allows you to create a User object with specified values for username and password.
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    //These methods are getter and setter methods that allow you to retrieve and modify the values of the private fields (id, username, password).
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
