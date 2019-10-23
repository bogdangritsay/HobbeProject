package com.basepackage;
import com.basepackage.Hobby;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Test
{
    public static void main( String[] args )
    {
        System.out.println("Hello!");
        Scanner in = new Scanner(System.in);
        Hobby firstHobby = new Hobby();
        Hobby secondHobby = new Hobby("Footbal", (byte)7, (short)19, 150, 30, 500.5f,1000, 'y', true);
        System.out.print("Input a name of the third hobby: ");
        String hobbyThirdName = in.next();
        System.out.print("Input a number if years of the third hobby: ");
        byte doNumYear = in.nextByte();
        System.out.print("This hobby is active now (answer: true/false): ");
        boolean isActive = in.nextBoolean();
        Hobby thirdHobby = new Hobby (hobbyThirdName, doNumYear,isActive);

        Hobby []hobbies = {firstHobby, secondHobby, thirdHobby};

        for (int i = 0; i <hobbies.length ; i++) {
            if(hobbies[i].getName()=="Unnamed") {
                System.out.println(i+1 + ". Ooops! No hobby information.");
                continue;
            }
            System.out.print(i+1 + ". ");
            System.out.println(hobbies[i]);
        }
    }
}
