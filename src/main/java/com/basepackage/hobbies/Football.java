package com.basepackage.hobbies;
import com.basepackage.Hobby;
import com.basepackage.hobbies.HobbyException;
public class Football extends Hobby {
    private int numGoals;
    private float avgGoals;

    public Football() {
        super();
    }
    public Football(final String name, final byte numYear, final float avgMoneyMonth, final boolean isActive, final int numGoals, final float avgGoals) {
        super(name, numYear, avgMoneyMonth, isActive);
        this.numGoals = numGoals;
        this.avgGoals = avgGoals;
    }

    @Override
    public String tellAboutHobby() throws HobbyException {
        try {
            if (getName().equals("Unnamed")) {
                throw new HobbyException();
            } else {
                return super.toString() + "\n { Number goals: " + this.numGoals + "\n Average number goals: " + this.avgGoals + "\n }";
            }
        } catch (HobbyException e) {
            return "No information about this hobby!";
        }
    }
}
