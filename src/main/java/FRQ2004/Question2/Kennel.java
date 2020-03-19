package FRQ2004.Question2;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public void allSpeak()
    {
        for (Pet pet: petList)
        {
            pet.speak();
        }

    }

}

