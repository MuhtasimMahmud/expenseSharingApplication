package com.project.expenseSharingApplication.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class messGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messID;
    private String messName;
    private int totalMember;

    @OneToMany(mappedBy = "mGroup", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<User> userList = new ArrayList<>();

    @OneToMany(mappedBy = "mGroup", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<month> monthsList = new ArrayList<>();


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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<month> getMonthsList() {
        return monthsList;
    }

    public void setMonthsList(List<month> monthsList) {
        this.monthsList = monthsList;
    }
}
