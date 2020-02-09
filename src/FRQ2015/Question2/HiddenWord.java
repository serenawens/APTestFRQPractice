package FRQ2015.Question2;

public class HiddenWord {

    private String word;

    public HiddenWord(String w)
    {
        word =w;
    }
    public String getHint(String guess)
    {
        String g = guess.toUpperCase();
        String returned ="";
        for (int i=0; i<g.length(); i++)
        {
            if(g.substring(i,i+1).equals(word.substring(i,i+1)))
            {
                returned = returned + word.substring(i,i+1);
            }
            else if (word.contains(g.substring(i, i + 1)))
            {
                returned = returned + "+";
            }
            else
            {
                returned = returned + "*";
            }
        }
        return returned;
    }

}
