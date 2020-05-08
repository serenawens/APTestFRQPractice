package Past_APCS_FRQs_Practice.FRQ2017.Question1;

import java.util.ArrayList;

// time takne 10 minutes:
public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if(num==0)
            digitList.add(num);
        int myNum = num;
        while(myNum>0)
        {
            digitList.add(0, myNum%10);
            myNum = myNum/10;
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i=0; i<digitList.size()-1; i++)
        {
            if(digitList.get(i)>=digitList.get(i+1))
                return false;
        }
        return true;
    }
    public void print()
    {
        System.out.println(digitList.toString());
    }

}
