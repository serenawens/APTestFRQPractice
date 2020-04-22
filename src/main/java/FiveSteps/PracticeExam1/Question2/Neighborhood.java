package FiveSteps.PracticeExam1.Question2;

import java.util.ArrayList;

///Time taken: 3 min
public class Neighborhood {
    private ArrayList<Family> families;

    public boolean isInNeighborhood(Person person)
    {
        for(Family f: families)
        {
            if(f.isInFamily(person))
            {
                return true;
            }
        }
        return false;
    }

}
