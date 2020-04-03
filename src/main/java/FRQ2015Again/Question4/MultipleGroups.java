package FRQ2015Again.Question4;
//TIme taken: 9 minutes
import java.util.ArrayList;
import java.util.List;

public class MultipleGroups implements  NumberGroup {

    private List<NumberGroup> list;

    public void add(NumberGroup type)
    {
        list.add(type);
    }

    public MultipleGroups()
    {
        list = new ArrayList<NumberGroup>();
    }



    public boolean contains(int num)
    {
        for(NumberGroup type: list)
        {
            if(type.contains(num))
            {
                return true;
            }
        }
        return false;
    }

}
