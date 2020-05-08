package Past_APCS_FRQs_Practice.FRQ2017.Question2;

// Time Taken: 10 minutes
public class MultPractice implements StudyPractice {
    private final int first;
    private int secondVal;

    public MultPractice(int firstNum, int second)
    {
        first = firstNum;
        secondVal = second;
    }

    public String getProblem()
    {
        return first + " TIMES " + secondVal;
    }
    public void nextProblem()
    {
        secondVal++;
    }

}
