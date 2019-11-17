package com.basepackage;

import java.util.Comparator;

public class HobbyComparator implements Comparator<Hobby> {

    @Override
    public int compare(Hobby o1, Hobby o2) {
        return o1.getNumYear() - o2.getNumYear();
    }
}