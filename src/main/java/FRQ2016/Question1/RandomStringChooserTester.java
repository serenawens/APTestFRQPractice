package FRQ2016.Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomStringChooserTester {
    public static void main(String[] args) {
        String array[] = {"wheels","on", "the","bus"};
        RandomStringChooserFinal strings = new RandomStringChooserFinal(array);
        String list = "";
        for(int k=0; k<6; k++)
        {
            list += strings.getNext() + " ";
        }
        System.out.println(list);
    }
}
