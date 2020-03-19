package FRQ2004.Question1;

import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList = new ArrayList<String>();

    public WordList(String a, String b, String c, String d, String e)
    {
        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);
        myList.add(e);
    }


    public int numWordsOfLength(int len)
    {
        int count =0;
        for(String str : myList)
        {
            if(str.length() == len)
            {
                count++;
            }
        }
        return count;
    }

    public void removeWordsOfLength(int len)
    {
        int i=0;
        while (i< myList.size())
        {
            if (myList.get(i).length() ==len)
            {
                myList.remove(myList.get(i));
            }
            else
            {
                i++;
            }
        }
    }

    public String toString()
    {
        return myList.toString();
    }

}
