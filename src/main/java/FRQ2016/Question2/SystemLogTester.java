package FRQ2016.Question2;

public class SystemLogTester {
    public static void main(String[] args) {
        SystemLog sys = new SystemLog();
        System.out.println(sys);
        //sys.removeMessages("disk");
        System.out.println(sys.removeMessages("disk"));
        System.out.println(sys);
    }
}
