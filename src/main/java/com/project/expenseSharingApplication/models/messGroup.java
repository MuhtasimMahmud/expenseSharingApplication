package com.project.expenseSharingApplication.models;


import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
public class messGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messID;
    private String messName;
    private int totalMember;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mess")
    private ArrayList<User> userList = new ArrayList<>();

    @OneToMany
    private ArrayList<month> monthsList = new ArrayList<>();


    // Default Constructor
    public messGroup() {
        super();
    }

    // Custom Constructor
    public messGroup(int messID, String messName, int totalMember) {
        this.messID = messID;
        this.messName = messName;
        this.totalMember = totalMember;
    }

    public int getMessID() {
        return messID;
    }

    public void setMessID(int messID) {
        this.messID = messID;
    }

    public String getMessName() {
        return messName;
    }

    public void setMessName(String messName) {
        this.messName = messName;
    }

    public int getTotalMember() {
        return totalMember;
    }

    public void setTotalMember(int totalMember) {
        this.totalMember = totalMember;
    }

    public ArrayList<User> getUserArrayList() {
        return userList;
    }

    public void setUserArrayList(ArrayList<User> userArrayList) {
        this.userList = userArrayList;
    }
}
