package FRQ2007.Question3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentAnswerSheetTester {
    public static void main(String[] args) {
        ArrayList<String> answerSheet = new ArrayList<String>();
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
        ArrayList<String> studentSheet1 = new ArrayList<String>();
        studentSheet1.add("A");
        studentSheet1.add("B");
        studentSheet1.add("D");
        studentSheet1.add("E");
        studentSheet1.add("A");
        studentSheet1.add("C");
        studentSheet1.add("?");
        studentSheet1.add("B");
        studentSheet1.add("D");
        studentSheet1.add("C");
        StudentAnswerSheet student1 = new StudentAnswerSheet("Marcy",studentSheet1);
        ArrayList<String> studentSheet2 = new ArrayList<String>();
        studentSheet2.add("A");
        studentSheet2.add("D");
        studentSheet2.add("D");
        studentSheet2.add("E");
        studentSheet2.add("B");
        studentSheet2.add("?");
        studentSheet2.add("E");
        studentSheet2.add("?");
        studentSheet2.add("B");
        studentSheet2.add("C");
        StudentAnswerSheet student2 = new StudentAnswerSheet("Minnie", studentSheet2);
        ArrayList<String> studentSheet3 = new ArrayList<String>();
        studentSheet3.add("A");
        studentSheet3.add("F");
        studentSheet3.add("D");
        studentSheet3.add("E");
        studentSheet3.add("B");
        studentSheet3.add("C");
        studentSheet3.add("E");
        studentSheet3.add("B");
        studentSheet3.add("B");
        studentSheet3.add("C");
        StudentAnswerSheet student3 = new StudentAnswerSheet("Mary", studentSheet3);


        System.out.println(student1.getScore(answerSheet));
        System.out.println(student2.getScore(answerSheet));
        System.out.println(student3.getScore(answerSheet));

        ArrayList<StudentAnswerSheet> classList = new ArrayList<StudentAnswerSheet>();
        classList.add(student1);
        classList.add(student2);
        classList.add(student3);
       TestResults test = new TestResults(classList);
        System.out.println(test.highestScoringStudent(answerSheet));
    }
}
