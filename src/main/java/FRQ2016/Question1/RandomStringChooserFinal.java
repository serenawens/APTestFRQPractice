package FRQ2016.Question1;

import java.util.ArrayList;

public class RandomStringChooserFinal {
    private ArrayList<String> words ;

    public RandomStringChooserFinal(String[] array)
    {
        words = new ArrayList<String>();
        for(int i=0; i<array.length; i++)
        {
            words.add(array[i]);
        }
    }

    public String getNext()
    {
        if(words.size()>0)
        {
            return words.remove((int)(Math.random()*words.size()));
        }
        return "NONE";
    }


}
