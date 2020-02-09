package FRQ2015.Question4;

public class MultipleGroupsTester {
    public static void main(String[] args) {
        MultipleGroups multiple = new MultipleGroups(new Range(5,8), new Range(10,12), new Range(1,6));
        System.out.println(multiple.contains(2));
        System.out.println(multiple.contains(9));
        System.out.println(multiple.contains(6));
    }
}
