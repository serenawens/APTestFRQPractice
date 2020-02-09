package FRQ2015.Question4;

import java.util.ArrayList;
import java.util.List;

public class MultipleGroups implements NumberGroup{

    private List<NumberGroup> groupList = new ArrayList<NumberGroup>();

    public MultipleGroups(NumberGroup group1, NumberGroup group2,NumberGroup group3)
    {
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);
    }

    public boolean contains(int num)
    {
        //1. go through each object in the array list
        for (NumberGroup set: groupList)
        {
            //2. go through each object's numbers to find if they contain num
            if(set.contains(num))
            {
                return true;
            }
        }
        return false;
    }
}
