package FRQ2016.Question1;

public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str)
    {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str)
    {
        String[] ble = {"y"};
        return ble;
    }

}
