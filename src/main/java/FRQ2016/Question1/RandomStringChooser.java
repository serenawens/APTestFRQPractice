package FRQ2016.Question1;

import java.util.ArrayList;

public class RandomStringChooser {
    private String[] words;

    public RandomStringChooser(String[] wordArray) {
        words = wordArray;
    }



    //Bad versin/first draft took 21 minutes
    public String getNextBAD()
    {
        /**
         * 1. find and return a random word from the array
         * 2. make sure the word can no longer be used in later get Next
         * 3. if all the words have been used, return "NONE"
         */
        ArrayList<String> usedWords = new ArrayList<String>();
        ArrayList<Integer> usedIndxes = new ArrayList<Integer>();
        String word = "NONE";
        int random; //random index for getting a word
        boolean wordFound = false;
        while(!wordFound )
        {
            random = (int)(Math.random()*words.length); //random index for getting a word
            for(int index: usedIndxes)
            {
                if(random == index)
                {
                    random = (int)(Math.random()*words.length);
                }
            }
            usedIndxes.add(random);
            for(String used : usedWords)
            {
                if(used!= null && !words[random].equals(used)) //if the word has not been used yet
                {
                    word = words[random];
                    usedWords.add(word);
                    wordFound = true;
                }
                //if the word has been used you need to go through the random stuff again
            }

        }
        return word;
    }
}
