package com.basepackage;
import com.basepackage.Hobby;
import com.basepackage.hobbies.Fishing;
import com.basepackage.hobbies.Football;

public class Test
{
    public static void main( String[] args )
    {
        System.out.println("Hello!");
        Hobby firstHobby = new Football("Football", (byte)5, 56.78f, true, 78, 2.5f);
        Hobby secondHobby = new Fishing("Fishing", (byte)3, 450f, true, 15.6f, 1.5f);
        Hobby []hobbies = {firstHobby, secondHobby};
        for (Hobby i: hobbies) {
            System.out.println(i.tellAboutHobby());
        }
    }
}
