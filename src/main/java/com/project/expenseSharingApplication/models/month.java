package com.project.expenseSharingApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.Month;
import java.time.Year;

@Entity
public class month {

    private Month monthName;
    private Year monthYear;
    @Id
    private String mID = monthName+","+monthYear;
    private int rent;
    private int foodBill;
    private int electricityBill;
    private int utilities;
    private int extraCost;

    @ManyToOne
    private messGroup mGroup;

    // Default Constructor
    public month() {
        super();
    }

    // Custom Constructor
    public month(Month monthName, Year monthYear, int rent, int foodBill, int electricityBill, int utilities, int extraCost) {
        this.monthName = monthName;
        this.monthYear = monthYear;
        this.rent = rent;
        this.foodBill = foodBill;
        this.electricityBill = electricityBill;
        this.utilities = utilities;
        this.extraCost = extraCost;
    }

    public Month getMonthName() {
        return monthName;
    }

    public void setMonthName(Month monthName) {
        this.monthName = monthName;
    }

    public Year getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(Year monthYear) {
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

    public messGroup getMGroup() {
        return mGroup;
    }

    public void setMGroup(messGroup messID) {
        this.mGroup = messID;
    }
}
