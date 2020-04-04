package FRQ2016.Question2;

public class LogMessageTester {
    public static void main(String[] args) {
        LogMessageA m1 = new LogMessageA("CLIENT3:disk");
        LogMessageA m2 = new LogMessageA("3:error on disk");
        LogMessageA m3 = new LogMessageA("4:error on /dev/disk disk");
        LogMessageA m4 = new LogMessageA("3:error on disk DSK1");
        boolean m = m1.containsWord("disk");
        boolean s = m2.containsWord("disk");
        System.out.println(m);
        System.out.println(s);
        boolean q = m3.containsWord("disk");
        System.out.println(q);
        System.out.println(m4.containsWord("disk"));
        LogMessageA m5 = new LogMessageA("32:DISK");
        LogMessageA m6 = new LogMessageA("32:error on disk3");
        LogMessageA m7 = new LogMessageA("32:error on dev/disk");
        LogMessageA m8 = new LogMessageA("32:diskette");
        boolean e = m5.containsWord("disk");
        System.out.println(e);
        System.out.println(m6.containsWord("disk"));
        System.out.println(m7.containsWord("disk"));
        System.out.println(m8.containsWord("disk"));
    }
}
