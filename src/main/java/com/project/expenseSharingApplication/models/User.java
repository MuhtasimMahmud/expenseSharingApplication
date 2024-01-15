package com.project.expenseSharingApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String name;
    private String email;
    private int messID; // je mess group e add ase oi mess group er id ta
    private boolean manager; // if this user is manager or not for the current month
    private String password;
    private String imgUrl;



}
