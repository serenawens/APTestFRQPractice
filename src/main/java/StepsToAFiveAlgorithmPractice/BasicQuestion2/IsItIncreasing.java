package StepsToAFiveAlgorithmPractice.BasicQuestion2;

import java.util.ArrayList;
//Time Taken: 7 min 30 seconds including testing and fix
public class IsItIncreasing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);
        list.add(36);
        list.add(40);
        list.add(42);
        list.add(43);
        list.add(51);
        list.add(52);
        System.out.println(isIncreasing(list));
    }

    public static boolean isIncreasing(ArrayList<Integer> arr)
    {
        ArrayList<Integer> incr = new ArrayList<Integer>();
        for(int i=0; i<arr.size()-1; i++)
        {
            int difference = arr.get(i+1) - arr.get(i);
            incr.add(difference);
        }
        for(int i=0; i<incr.size()-1; i++)
        {
            if(incr.get(i)<=0)
            {
                return false;
            }
        }
        return true;
    }

}
