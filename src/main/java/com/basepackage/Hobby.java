package com.basepackage;

public class Hobby {
    private String name;
    private byte numYear;
    private short numFriends;
    private int hoursMonth;
    private long MoneyOnce;
    private float avgMoneyMonth;
    private double avgMoneyYear;
    private char isGame;            //"y" or "n"
    private boolean isActive;
    //constructors
    public Hobby(String name, byte numYear, short numFriends, int hoursMonth, long moneyOnce, float avgMoneyMonth, double avgMoneyYear, char isGame, boolean isActive) {
        this.name = name;
        this.numYear = numYear;
        this.numFriends = numFriends;
        this.hoursMonth = hoursMonth;
        MoneyOnce = moneyOnce;
        this.avgMoneyMonth = avgMoneyMonth;
        this.avgMoneyYear = avgMoneyYear;
        this.isGame = isGame;
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

    public short getNumFriends() {
        return numFriends;
    }

    public void setNumFriends(short numFriends) {
        this.numFriends = numFriends;
    }

    public int getHoursMonth() {
        return hoursMonth;
    }

    public void setHoursMonth(int hoursMonth) {
        this.hoursMonth = hoursMonth;
    }

    public long getMoneyOnce() {
        return MoneyOnce;
    }

    public void setMoneyOnce(long moneyOnce) {
        MoneyOnce = moneyOnce;
    }

    public float getAvgMoneyMonth() {
        return avgMoneyMonth;
    }

    public void setAvgMoneyMonth(float avgMoneyMonth) {
        this.avgMoneyMonth = avgMoneyMonth;
    }

    public double getAvgMoneyYear() {
        return avgMoneyYear;
    }

    public void setAvgMoneyYear(double avgMoneyYear) {
        this.avgMoneyYear = avgMoneyYear;
    }

    public char getIsGame() {
        return isGame;
    }

    public void setIsGame(char isGame) {
        this.isGame = isGame;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    //toString

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", numYear=" + numYear +
                ", numFriends=" + numFriends +
                ", hoursMonth=" + hoursMonth +
                ", MoneyOnce=" + MoneyOnce +
                ", avgMoneyMonth=" + avgMoneyMonth +
                ", avgMoneyYear=" + avgMoneyYear +
                ", isGame=" + isGame +
                ", isActive=" + isActive +
                '}';
    }

}
