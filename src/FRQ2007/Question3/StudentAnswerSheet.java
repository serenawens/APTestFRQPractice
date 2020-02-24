package FRQ2007.Question3;


import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers; // the list of the student's answers
    private String name;

    public StudentAnswerSheet(String studentName, ArrayList<String> answerSheet)
    {
        name =studentName;
        answers = answerSheet;
    }

    /** @param key the list of correct answers, represented as strings of length one
     * Precondition: key.size() is equal to the number of answers in this answer sheet
     * @return this student's test score
     */
    public double getScore(ArrayList<String> key)
    {
        double score=0;
        for (int i=0; i<key.size(); i++)
        {
            boolean correct = answers.get(i).equals(key.get(i));
            if(correct)
            {
                score= score+1;
            }
            else if(!answers.get(i).equals("?"))
            {
                score = score-0.25;
            }
        }
        return score;
    }

    public String getName()
    {
        return name;
    }

}
