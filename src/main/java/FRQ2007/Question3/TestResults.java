package FRQ2007.Question3;

import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public TestResults(ArrayList<StudentAnswerSheet> list)
    {
        sheets = list;
    }

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
        for(int i=1; i<sheets.size(); i++)
        {
            double highScore = highestStudent.getScore(key);
            double comparison = highScore-sheets.get(i).getScore(key);
            if(comparison<0)
            {
                highestStudent= sheets.get(i);
            }
        }
        return highestStudent.getName() + " is the highest scoring student with a score of " + highestStudent.getScore(key);
    }

}
