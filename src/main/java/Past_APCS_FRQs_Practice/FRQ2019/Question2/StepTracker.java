package Past_APCS_FRQs_Practice.FRQ2019.Question2;

import java.util.ArrayList;

// AP ID: 99V0W60Y
// SW
// QUESTION 2

/**
 * SCORE: 9/9
 */
public class StepTracker {
    private final int requiredSteps;
    private ArrayList<Integer> dailySteps;


    public StepTracker(int minActiveSteps)
    {
        dailySteps = new ArrayList<Integer>();
        requiredSteps = minActiveSteps;
    }

    public void addDailySteps(int steps)
    {
        dailySteps.add(steps);
    }

    public int activeDays()
    {
        int activeDayCount=0;
        for(int steps: dailySteps)
        {
            if(steps>=requiredSteps)
                activeDayCount++;
        }
        return activeDayCount;
    }

    public double averageSteps()
    {
        if(dailySteps.size()==0)
            return 0;
        double totalSteps = 0;
        for(int steps: dailySteps)
            totalSteps+=steps;
        return totalSteps/dailySteps.size();
    }

}
