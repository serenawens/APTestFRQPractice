package Past_APCS_FRQs_Practice.FRQ2017.Question2;

public class PracticeTester {
    public static void main(String[] args) {
        StudyPractice p1 = new MultPractice(4,12);
        p1.nextProblem();
        System.out.println(p1.getProblem());
        System.out.println(p1.getProblem());

        p1.nextProblem();
        p1.nextProblem();
        System.out.println(p1.getProblem());
    }
}
