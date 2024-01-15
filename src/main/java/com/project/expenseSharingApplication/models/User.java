package com.project.expenseSharingApplication.models;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String name;
    @Column (unique = true)
    private String email;
    private int messID; // je mess group e add ase oi mess group er id ta
    private boolean manager; // if this user is manager or not for the current month
    private String password;
    private String imgUrl;


    // Default Constructor
    public User() {
        super();
    }

    // Custom Constructor
    public User(int userID, String name, String email, int messID, boolean manager, String password, String imgUrl) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.messID = messID;
        this.manager = manager;
        this.password = password;
        this.imgUrl = imgUrl;
    }



    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMessID() {
        return messID;
    }

    public void setMessID(int messID) {
        this.messID = messID;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
