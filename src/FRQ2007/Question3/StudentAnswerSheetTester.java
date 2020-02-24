package FRQ2007.Question3;

import java.util.ArrayList;

public class StudentAnswerSheetTester {
    public static void main(String[] args) {
        ArrayList<String> answerSheet = new ArrayList<>();
        answerSheet.add("A");
        answerSheet.add("C");
        answerSheet.add("D");
        answerSheet.add("E");
        answerSheet.add("B");
        answerSheet.add("C");
        answerSheet.add("E");
        answerSheet.add("B");
        answerSheet.add("B");
        answerSheet.add("C");
        ArrayList<String> studentSheet = new ArrayList<>();
        studentSheet.add("A");
        studentSheet.add("B");
        studentSheet.add("D");
        studentSheet.add("E");
        studentSheet.add("A");
        studentSheet.add("C");
        studentSheet.add("?");
        studentSheet.add("B");
        studentSheet.add("D");
        studentSheet.add("C");
        StudentAnswerSheet student1 = new StudentAnswerSheet("Marcy",studentSheet);

        System.out.println(student1.getScore(answerSheet));
        //student1.getScore(answerSheet);

    }
}
