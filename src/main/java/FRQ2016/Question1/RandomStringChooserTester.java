package FRQ2016.Question1;

public class RandomStringChooserTester {
    public static void main(String[] args) {
        String array[] = {"wheels","on", "the","bus"};
        RandomStringChooserA strings = new RandomStringChooserA(array);
        String list = "";
        for(int k=0; k<6; k++)
        {
            list += strings.getNext() + " ";
        }
        System.out.println(list);
    }
}
