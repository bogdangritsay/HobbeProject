package com.basepackage.hobbies;
import com.basepackage.Hobby;

import java.util.Objects;

public class Fishing extends Hobby {
    private float maxWeightFish;
    private float avgCatch;
    public Fishing() {
        super();
    }

    public Fishing(final String name, final byte numYear, final float avgMoneyMonth, final  boolean isActive, final float maxWeightFish, final float avgCatch) {
        super(name, numYear, avgMoneyMonth, isActive);
        this.maxWeightFish = maxWeightFish;
        this.avgCatch = avgCatch;
    }

    @Override
    public String tellAboutHobby() throws HobbyException {
        try {
            if (getName().equals("Unnamed")) {
                throw new HobbyException();
            } else {
                return super.toString() + "\n { Max Fish Weight: " + this.maxWeightFish
                    + "kg \n Average fish weight: " + this.avgCatch + "kg \n }";
            }
        } catch (HobbyException e) {
            return "No information about this hobby!";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fishing)) return false;
        Fishing fishing = (Fishing) o;
        return Float.compare(fishing.maxWeightFish, maxWeightFish) == 0 &&
                Float.compare(fishing.avgCatch, avgCatch) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeightFish, avgCatch);
    }
}
