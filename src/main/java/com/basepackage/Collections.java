package com.basepackage;
import com.basepackage.hobbies.Fishing;

import java.lang.System;
import java.util.*;

public class Collections  {
    static HobbyComparator hobbyComparator = new HobbyComparator();
    static Hobby fishingTest = new Fishing();
    static private List<Hobby> hobbyArrayList = new ArrayList<>();
    static private List<Hobby> hobbyLinkedList = new LinkedList<>();
    static private Set<Hobby> hobbyTreeSet = new TreeSet<>(hobbyComparator);
    static private Set<Hobby> hobbyHashSet = new HashSet<>();
    static private HashMap<Integer, Hobby> hobbyHashMap = new HashMap<>();
    static private TreeMap<Integer, Hobby> hobbyTreeMap = new TreeMap<>();



    public static void generateCollection(int num) {
        switch (num) {
            case(0):
                System.exit(0);
                break;
            case(1):
                System.out.println("You chose work with ArrayList.");
                break;
            case(2):
                System.out.println("You chose work with LinkedList.");
                break;
            case(3):
                System.out.println("You chose work with HashSet.");
                break;
            case(4):
                //TreeSet<Hobby> treeSet = new TreeSet<>();
                System.out.println("You chose work with TreeSet.");
                break;
            case(5):
               //HashMap<Hobby> hobbyHashMap = new HashMap<>();
                System.out.println("You chose work with HashMap.");
                break;
            case(6):
                //TreeMap
                System.out.println("You chose work with TreeMap.");
                break;
            case(7):
                System.out.println("Statistics:");




                MainMenu.drawStatistics();
                break;
            default:
                System.out.println("Enter the correct number!");
                break;
        }
    }

    public  static void chooseAction(int numAction, int numColl, int numElements) {
        long t1;
        long t2;
        switch(numAction) {
            case(1):
                System.out.println("You choose add objects \n");
                t1 = System.currentTimeMillis();
                addElements(numColl, numElements);
                t2 = System.currentTimeMillis();
                System.out.println("Time: " + (t2-t1) +" milliseconds.");
            case(2):
                System.out.println("You choose remove objects \n");
                t1 = System.currentTimeMillis();
                removeElements(numColl, numElements);
                t2 = System.currentTimeMillis();
                System.out.println("Time: " + (t2-t1) +" milliseconds.");
                break;
            case(3):
                System.out.println("You choose get objects \n");
                t1 = System.currentTimeMillis();
                getElements(numColl, numElements);
                t2 = System.currentTimeMillis();
                System.out.println("Time: " + (t2-t1) +" milliseconds.");
                break;
        }
    }

    public static void addElements(int numColl, int numElements) {
        switch(numColl) {
            /* ArrayList */
            case(1):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyArrayList.add(hobby);
                    //System.out.println(hobbyArrayList.get(i).toString());;
                }

                break;
            /*LinkedList*/
            case(2):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyLinkedList.add(hobby);
                }
                break;
            /*HashSet*/
            case(3):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));

                    hobbyHashSet.add(hobby);
                }
                break;
            case(4):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyTreeSet.add(hobby);
                }
                break;
            case(5):
                for (int i = 0; i < numElements; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyHashMap.put(i, hobby);
                }
                break;
            case(6):
                for (int i = 0; i < numElements; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyTreeMap.put(i, hobby);
                }
                break;
        }
}

    public static void getElements(int numColl, int numElements) {
        try {
            switch (numColl) {
                /* ArrayList */
                case (1):
                    for (int i = 0; i < numElements; i++) {
                        //System.out.println(hobbyArrayList.get(i).toString());
                        hobbyArrayList.get(i);
                    }
                    break;
                /*LinkedList*/
                case (2):
                    for (int i = 0; i < numElements; i++) {
                        //System.out.println(hobbyLinkedList.get(i).toString());
                        hobbyLinkedList.get(i);
                    }
                    break;
                /*HashSet*/
                case (3):
                    System.out.println("Impossible to use method Get for HashSet");
                    break;
                case (4):
                   System.out.println("Impossible to use method Get for TreeSet");
                    break;
                case (5):
                    for (int i = 0; i < numElements; i++) {
                        hobbyHashMap.get(i);
                    }
                    break;
                case (6):
                    for (int i = 0; i < numElements; i++) {
                        hobbyTreeMap.get(i);
                    }
                    break;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Add objects before getting them!!!\n");
        }
    }

    public static void removeElements(int numColl, int numElements) {
        switch(numColl) {
            /* ArrayList */
            case(1):
                for (int i = 0; i < numElements; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyArrayList.remove(hobby);
                    //System.out.println(hobbyArrayList.get(i).toString());;
                }

                break;
            /*LinkedList*/
            case(2):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyLinkedList.remove(hobby);
                }
                break;
            /*HashSet*/
            case(3):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));

                    hobbyHashSet.remove(hobby);
                }
                break;
            case(4):
                for (int i = 0; i < numElements ; i++) {
                    Fishing hobby = new Fishing("Test Name", (byte)(i+1), (float)(i+1.2), true, (float)(i + 5.5), (float)(i + 4.5));
                    hobbyTreeSet.remove(hobby);
                }
                break;
            case(5):
                for (int i = 0; i < numElements ; i++) {
                    hobbyHashMap.remove(i);
                }
                break;
            case(6):
                for (int i = 0; i < numElements ; i++) {
                    hobbyTreeMap.remove(i);
                }
                break;
        }
    }
}
