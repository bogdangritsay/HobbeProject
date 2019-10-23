package com.basepackage.hobbies;
import com.basepackage.Hobby;
public class Football extends Hobby {
    private int numGoals;
    private float avgGoals;

    public Football(String name, byte numYear, float avgMoneyMonth, boolean isActive, int numGoals, float avgGoals) {
        super(name, numYear, avgMoneyMonth, isActive);
        this.numGoals = numGoals;
        this.avgGoals = avgGoals;
    }

    @Override
    public String tellAboutHobby() {
        return super.toString() +"\n { Number goals: " + this.numGoals + "\n Average number goals: "+this.avgGoals+"\n }";
    }
}
