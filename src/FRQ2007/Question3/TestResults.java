package FRQ2007.Question3;

import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    /** Precondition: sheets.size() 0 > ;
     * all answer sheets in sheets have the same number of answers
     * @param key the list of correct answers represented as strings of length one
     * Precondition: key.size() is equal to the number of answers
     * in each of the answer sheets in sheets
     * @return the name of the student with the highest score
     */
    public String highestScoringStudent(ArrayList<String> key)
    {
        StudentAnswerSheet highestStudent=sheets.get(0);
        for(StudentAnswerSheet student: sheets)
        {
            if(student.getScore(key)>highestStudent.getScore(key))
            {
                
            }
        }
        return highestStudent.getName();
    }

}
