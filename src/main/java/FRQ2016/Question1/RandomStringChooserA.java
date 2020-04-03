package FRQ2016.Question1;

import java.util.ArrayList;

public class RandomStringChooserA {
    private String[] words;
    private ArrayList<Integer> usedIndexes;

    public RandomStringChooserA(String[] array)
    {
       words = array;
       usedIndexes = new ArrayList<Integer>();

    }


    public String getNextImproved()
    {
        int random = (int) (Math.random()*words.length);
        String next;
        boolean used=false;
        boolean works;
        int i=0;
        /**ensures that if the index has not been used, then it will go leave the loop
         * occurs until the random index found has not been used
         * or until7*/
        while(!used)
        {
            // when the random index has already been used, generate another
            //
            if(usedIndexes.get(i) == random)
            {
                random = (int)(Math.random()*words.length);
                used = true;
                i++;
            }
            /**if every index has been used
             * scenario where even at the end of the day, NONE of the indexes have worked: they have all been used.
             * the loop has reached the last "used index" and none of the random indexes have worked
             */
            if(i== usedIndexes.size()-1 && used)
            {
                next = "NONE";
                break;
            }
        }
        next = words[random]; // will only happen if index has not been used
        if(!used)
        {
            usedIndexes.add(random);
        }
        return next;
    }

    public String getNext()
    {
        String next = "NONE";
        int random = (int)(Math.random()*words.length);
        boolean allUsed = false;

        for(int i=0; i<usedIndexes.size(); i++)
        {
            if(random==usedIndexes.get(i)) //if the index has already been used
            {
                random=(int)(Math.random()*words.length);
                allUsed = true;
            }
        }
        if (!allUsed)
        {
            next = words[random];
            usedIndexes.add(random);
        }

        return next;
    }

}
