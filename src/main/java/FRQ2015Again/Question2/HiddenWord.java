package FRQ2015Again.Question2;

public class HiddenWord {
    private String word;

    public HiddenWord(String givenWord)
    {
        word = givenWord;
    }

    public String getHint(String guess)
    {
        String hint ="";
        int i=0;
        while(i<word.length())
        {
           String guessLetter = guess.substring(i, i+1);
           String wordLetter = word.substring(i,i+1);
           if(guessLetter.equals(wordLetter))
           {
               hint+= wordLetter;
               i++;
           }
           else if(word.contains(guessLetter))
           {
               hint+="+";
               i++;
           }
           else
           {
               hint+= "*";
               i++;
           }
        }
        return hint;
    }

}
