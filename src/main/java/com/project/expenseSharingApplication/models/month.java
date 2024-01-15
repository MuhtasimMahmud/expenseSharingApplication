package com.project.expenseSharingApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class month {

    private String monthName;
    private int monthYear;
    @Id
    private String mID = monthName+","+monthYear;
    private int rent;
    private int foodBill;
    private int electricityBill;
    private int utilities;
    private int extraCost;

    @ManyToOne
    private messGroup messID;

    // Default Constructor
    public month() {
        super();
    }

    // Custom Constructor
    public month(String monthName, int monthYear, String mID, int rent, int foodBill, int electricityBill, int utilities, int extraCost) {
        this.monthName = monthName;
        this.monthYear = monthYear;
        this.mID = mID;
        this.rent = rent;
        this.foodBill = foodBill;
        this.electricityBill = electricityBill;
        this.utilities = utilities;
        this.extraCost = extraCost;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(int monthYear) {
        this.monthYear = monthYear;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getFoodBill() {
        return foodBill;
    }

    public void setFoodBill(int foodBill) {
        this.foodBill = foodBill;
    }

    public int getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(int electricityBill) {
        this.electricityBill = electricityBill;
    }

    public int getUtilities() {
        return utilities;
    }

    public void setUtilities(int utilities) {
        this.utilities = utilities;
    }

    public int getExtraCost() {
        return extraCost;
    }

    public void setExtraCost(int extraCost) {
        this.extraCost = extraCost;
    }

    public messGroup getMessID() {
        return messID;
    }

    public void setMessID(messGroup messID) {
        this.messID = messID;
    }
}
