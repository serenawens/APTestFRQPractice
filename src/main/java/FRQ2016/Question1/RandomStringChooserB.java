package FRQ2016.Question1;

import java.util.ArrayList;

public class RandomStringChooserB {
    private String words[];
    private ArrayList<Integer> indexesAvail;

    public RandomStringChooserB(String array[])
    {
        words = array;
        indexesAvail = new ArrayList<Integer>();
        for(int i=0; i<array.length; i++)
        {
            indexesAvail.add(i);
        }
    }

    public String getNext()
    {
        String next ="";
        int random;
        int indexToRemove=-1;
        boolean found = false;
        while(!found && indexesAvail.size()!=0)
        {
            random = (int)(Math.random()*indexesAvail.size());
            for(int i=0; i<indexesAvail.size(); i++)
            {
                if(random==i)
                {
                    indexToRemove = i;
                    found = true;
                    next = words[i];
                }
            }
            if(indexToRemove>-1)
            {
                indexesAvail.remove(indexToRemove);
            }
        }
        if(indexesAvail.size()==0)
        {
            next = "NONE";
        }
        return next;
    }

}
