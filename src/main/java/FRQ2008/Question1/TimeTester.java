package FRQ2008.Question1;

public class TimeTester {
    public static void main(String[] args) {
        Time time1 = new Time(9,2);
        Time time2 = new Time(10, 2);
        Time time3 = new Time(8, 2);
        System.out.println(time1.minutesUntil(time2));
        System.out.println(time1.minutesUntil(time3));
        System.out.println(time2.minutesUntil(time3));
        System.out.println(time2.minutesUntil(time1));
    }
}
