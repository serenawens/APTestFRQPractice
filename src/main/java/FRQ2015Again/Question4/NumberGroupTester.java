package FRQ2015Again.Question4;

public class NumberGroupTester {
    public static void main(String[] args) {
        MultipleGroups group = new MultipleGroups();
        group.add(new Range(5,8));
        group.add(new Range(10,12));
        group.add(new Range(1,6));
        System.out.println(group.contains(2));
        System.out.println(group.contains(9));
        System.out.println(group.contains(6));
    }
}
