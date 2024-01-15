package com.project.expenseSharingApplication.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class messGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messID;
    private String messName;
    private int totalMember;


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
}
