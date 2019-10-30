package com.basepackage;
import com.basepackage.Hobby;
import com.basepackage.hobbies.Fishing;
import com.basepackage.hobbies.Football;
import com.basepackage.hobbies.HobbyException;

public class Test {
    public static void main(String[] args) throws HobbyException {
        System.out.println("Hello! Let`s talk about hobby!\n");
       Hobby firstHobby = new Football("Football",
                (byte) 5, 56.78f, true, 78, 2.5f);
        Hobby secondHobby = new Fishing("Fishing",
                (byte) 3, 450f, true, 15.6f, 1.5f);
        Hobby thirdHobby = new Football();
        Hobby[] hobbies = {firstHobby, secondHobby, thirdHobby};
        //Демонстрация работы HobbyException
        int iN = 0;
          for (Hobby i : hobbies) {
              iN++;
              System.out.println("Hobby №" + iN + "\n" + i.tellAboutHobby());
          }
        /*
        при вызове метода tellAboutHobby(), если обнаружено, что хобби не имеет типа (Unnamed), что происходит
        при инициализации обьекта конструктормо по умолчанию, то кидается HobbyException, при обработке которого
        выводится сообщение об отсутствии информации про данный обьект хобби
        */
    }
}

