package FiveSteps.PracticeExam1.Question2;
//Time taken:11 min
import java.util.ArrayList;

public class Family {
    private ArrayList<Person> adults;
    private ArrayList<Person> children;

    public Family()
    {
        adults = new ArrayList<Person>();
        children = new ArrayList<Person>();
    }

    public void add(Person p)
    {
        if(!isInFamily(p))  //make sure not already in the family
        {
            if (p.getAge() < 18) {
                children.add(p);
            } else {
                adults.add(p);
            }
        }
    }

    public boolean isInFamily(Person p)
    {
        for(Person a: adults)
        {
            if(a.matches(p))
            {
                return true;
            }
        }
        for(Person c: children)
        {
            if(c.matches(p))
                return true;
        }
        return false;
    }



}
