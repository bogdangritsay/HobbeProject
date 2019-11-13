package com.basepackage;
import org.apache.log4j.Logger;
import com.basepackage.hobbies.Fishing;
import com.basepackage.hobbies.Football;
import com.basepackage.hobbies.HobbyException;

public class Test {
    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(final String[] args) throws HobbyException {
        logger.info("Program was been started! successfully!");
        try {
            System.out.println("Hello! Let`s talk about hobby!\n");
            Hobby firstHobby = new Football("Football",
                    (byte) 5, 56.78f, true, 78, 2.5f);
            Hobby secondHobby = new Fishing("Fishing",
                    (byte) 3, 450f, true, 15.6f, 1.5f);
            Hobby thirdHobby = new Football();
            Hobby[] hobbies = {firstHobby, secondHobby, thirdHobby};
            logger.info("Array of hobbies was been successfully created!");
            //Демонстрация работы HobbyException
            int iN = 0;
            for (Hobby i : hobbies) {
                iN++;
                System.out.println("Hobby №" + iN + "\n" + i.tellAboutHobby());
            }
            logger.info("Array of hobbies was been successfully created!");
            throw new HobbyException();
        } catch (HobbyException e) {
            logger.error("There is HobbyException!!!");
        } catch (Exception e) {
            logger.error("There is Exception!!!");
        } finally {
            logger.error("Error! The program did not complete it-s work successfully! ");
        }
    }
}

