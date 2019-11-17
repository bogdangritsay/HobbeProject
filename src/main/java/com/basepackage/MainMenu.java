package com.basepackage;

public class MainMenu {

    public static void drawMainMenu() {
        System.out.println("Enter the number: \n"
                + "1. Work with ArrayList \n"
                + "2. Work with LinkedList \n"
                + "3. Work with HashSet \n"
                + "4. Work with TreeSet \n"
                + "5. Work with HashMap \n"
                + "6. Work with TreeMap \n"
                + "7. Statistics \n"
                + "0. Exit \n");
    }
    public static void drawSubMenu() {
        System.out.println("Enter the number: \n"
               + "1. Add \n"
               + "2. Remove \n"
               + "3. Get Element \n");
    }

    public static void drawStatistics() {
        long t1;
        long t2;
        long tAdd;
        long tGet;
        long tRemove;
        System.out.println("-------------------------------------------------------------\n" +
                           "\t\t\tadd\t\tremove\t\tgetElement\n" +
                           "-------------------------------------------------------------\n");
        for(int i=1; i<=7;i++) {
            switch (i) {
                case(1) : {
                    t1 = System.currentTimeMillis();
                    Collections.addElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tAdd = t2-t1;
                    t1 = System.currentTimeMillis();
                    Collections.getElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tGet = t2- t1;
                    t1 = System.currentTimeMillis();
                    Collections.removeElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tRemove = t2-t1;
                    System.out.println(" ArrayList\t" +tAdd +"\t\t" + tRemove +"\t\t\t" + tGet+"\t\t" + "\n"+
                    "-------------------------------------------------------------\n");
                    break;
                }
                case(2) : {
                    t1 = System.currentTimeMillis();
                    Collections.addElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tAdd = t2-t1;
                    t1 = System.currentTimeMillis();
                    Collections.getElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tGet = t2- t1;
                    t1 = System.currentTimeMillis();
                    Collections.removeElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tRemove = t2-t1;
                    System.out.println(" LinkedList\t" +tAdd +"\t\t" + tRemove +"\t\t\t" + tGet+"\t\t" + "\n"+
                            "-------------------------------------------------------------\n");
                    break;
                }
                case(3) : {
                    t1 = System.currentTimeMillis();
                    Collections.addElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tAdd = t2-t1;
                    t1 = System.currentTimeMillis();
                    t1 = System.currentTimeMillis();
                    Collections.removeElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tRemove = t2-t1;
                    System.out.println(" HashSet\t" +tAdd +"\t\t" + tRemove +"\t\t\t" + "IMPOSSIBLE"+"\t\t" + "\n"+
                            "-------------------------------------------------------------\n");
                    break;
                }
                case(4) : {
                    t1 = System.currentTimeMillis();
                    Collections.addElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tAdd = t2-t1;
                    t1 = System.currentTimeMillis();
                    t1 = System.currentTimeMillis();
                    Collections.removeElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tRemove = t2-t1;
                    System.out.println(" TreeSet\t" +tAdd +"\t\t" + tRemove +"\t\t\t" + "IMPOSSIBLE"+"\t\t" + "\n"+
                            "-------------------------------------------------------------\n");
                    break;
                }
                case(5) :{
                    t1 = System.currentTimeMillis();
                    Collections.addElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tAdd = t2-t1;
                    t1 = System.currentTimeMillis();
                    Collections.getElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tGet = t2- t1;
                    t1 = System.currentTimeMillis();
                    Collections.removeElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tRemove = t2-t1;
                    System.out.println(" HashMap\t" +tAdd +"\t\t" + tRemove +"\t\t\t" + tGet+"\t\t" + "\n"+
                            "-------------------------------------------------------------\n");
                    break;
                }
                case(6) :{
                    t1 = System.currentTimeMillis();
                    Collections.addElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tAdd = t2-t1;
                    t1 = System.currentTimeMillis();
                    Collections.getElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tGet = t2- t1;
                    t1 = System.currentTimeMillis();
                    Collections.removeElements(i,Test.getNumElements());
                    t2 = System.currentTimeMillis();
                    tRemove = t2-t1;
                    System.out.println(" TreeMap\t" +tAdd +"\t\t" + tRemove +"\t\t\t" + tGet+"\t\t" + "\n"+
                            "-------------------------------------------------------------\n");
                }
            }
        }
    }
}
