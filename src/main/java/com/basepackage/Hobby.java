package com.basepackage;

public abstract class Hobby {
    private String name;
    private byte numYear;
    private float avgMoneyMonth;
    private boolean isActive;
    //constructors
    public Hobby(String name, byte numYear, float avgMoneyMonth, boolean isActive) {
        this.name = name;
        this.numYear = numYear;
        this.avgMoneyMonth = avgMoneyMonth;
        this.isActive = isActive;
    }

    public Hobby() {
        super();
       this.name = "Unnamed";
    }

    public Hobby(String name, byte numYear, boolean isActive) {
        this.name = name;
        this.numYear = numYear;
        this.isActive = isActive;
    }
    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getNumYear() {
        return numYear;
    }

    public void setNumYear(byte numYear) {
        this.numYear = numYear;
    }

    public float getAvgMoneyMonth() {
        return avgMoneyMonth;
    }

    public void setAvgMoneyMonth(float avgMoneyMonth) {
        this.avgMoneyMonth = avgMoneyMonth;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", numYear=" + numYear +
                ", avgMoneyMonth=" + avgMoneyMonth +
                ", isActive=" + isActive +
                '}';
    }

    public abstract String tellAboutHobby();

}


