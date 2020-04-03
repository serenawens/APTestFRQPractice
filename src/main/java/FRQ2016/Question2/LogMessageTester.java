package FRQ2016.Question2;

public class LogMessageTester {
    public static void main(String[] args) {
        LogMessage m1 = new LogMessage("CLIENT3:disk");
        LogMessage m2 = new LogMessage("3:error on disk");
        LogMessage m3 = new LogMessage("4:error on /dev/disk disk");
        LogMessage m4 = new LogMessage("3:error on disk DSK1");
        boolean m = m1.containsWord("disk");
        boolean s = m2.containsWord("disk");
        System.out.println(m);
        System.out.println(s);
        boolean q = m3.containsWord("disk");
        System.out.println(q);
        System.out.println(m4.containsWord("disk"));
        LogMessage m5 = new LogMessage("32:DISK");
        LogMessage m6 = new LogMessage("32:error on disk3");
        LogMessage m7 = new LogMessage("32:error on dev/disk");
        LogMessage m8 = new LogMessage("32:diskette");
        boolean e = m5.containsWord("disk");
        System.out.println(e);
        System.out.println(m6.containsWord("disk"));
        System.out.println(m7.containsWord("disk"));
        System.out.println(m8.containsWord("disk"));
    }
}
