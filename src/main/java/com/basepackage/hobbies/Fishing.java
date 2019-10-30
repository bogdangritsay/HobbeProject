package com.basepackage.hobbies;
import com.basepackage.Hobby;

public class Fishing extends Hobby {
    private float maxWeightFish;
    private float avgCatch;
    public Fishing() {
        super();
    }

    public Fishing(String name, byte numYear, float avgMoneyMonth, boolean isActive, float maxWeightFish, float avgCatch) {
        super(name, numYear, avgMoneyMonth, isActive);
        this.maxWeightFish = maxWeightFish;
        this.avgCatch = avgCatch;
    }

    @Override
    public String tellAboutHobby() throws HobbyException{
        try {
            if (getName().equals("Unnamed")) {
                throw new HobbyException();
            } else return super.toString() + "\n { Max Fish Weight: " + this.maxWeightFish
                    + "kg \n Average fish weight: " + this.avgCatch + "kg \n }";
        }
        catch (HobbyException e){
            return "No information about this hobby!";
        }
    }
}
