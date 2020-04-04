package FRQ2016.Question1;

public class RandomLetterChooser extends RandomStringChooserFinal {

    public RandomLetterChooser(String str)
    {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str)
    {
        String[] letters = new String[str.length()];
        for(int i=0; i<str.length()-1; i++)
        {
            letters[i] = str.substring(i, i+1);
        }
        return letters;
    }

}
