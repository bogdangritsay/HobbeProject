package com.basepackage;

import com.basepackage.hobbies.HobbyException;

public abstract class Hobby {
    private String name;
    private byte numYear;
    private float avgMoneyMonth;
    private boolean isActive;

    //constructors
    public Hobby(final String name, final byte numYear, final float avgMoneyMonth, final boolean isActive) {
        this.name = name;
        this.numYear = numYear;
        this.avgMoneyMonth = avgMoneyMonth;
        this.isActive = isActive;
    }

    public Hobby() {
        super();
        this.name = "Unnamed";
    }

    public Hobby(final String name, final byte numYear, final boolean isActive) {
        this.name = name;
        this.numYear = numYear;
        this.isActive = isActive;
    }
    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public byte getNumYear() {
        return numYear;
    }

    public void setNumYear(final byte numYear) {
        this.numYear = numYear;
    }

    public float getAvgMoneyMonth() {
        return avgMoneyMonth;
    }

    public void setAvgMoneyMonth(final float avgMoneyMonth) {
        this.avgMoneyMonth = avgMoneyMonth;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(final boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Hobby{"
                + "name='" + name + '\''
                + ", numYear=" + numYear
                + ", avgMoneyMonth=" + avgMoneyMonth
                + ", isActive=" + isActive + '}';
    }


    public abstract String tellAboutHobby() throws HobbyException;

}



