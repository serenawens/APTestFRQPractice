package FRQ2005.Question4;

public class StudentRecordTest {
    public static void main(String[] args) {

        int[] scoreSet2 ={20,50,50,53,80};
        StudentRecord rec2 = new StudentRecord(scoreSet2);
        //rec2.finalAverage();
        System.out.println(rec2.finalAverage());

        int[] scoreSet3= {20,50,50,80};
        StudentRecord rec3 = new StudentRecord(scoreSet3);
        System.out.println(rec3.finalAverage());
    }
}
