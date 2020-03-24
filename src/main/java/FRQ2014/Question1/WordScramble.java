package FRQ2014.Question1;

//TIME TKANE: 20 minutes
import java.util.ArrayList;
import java.util.List;

public class WordScramble {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("TAN");
        list.add("ABRACADABRA");
        list.add("WHOA");
        list.add("APPLE");
        list.add("EGGS");
        System.out.println(list);
        scrambleOrRemove(list);
        System.out.print(list);

    }

    public static String scrambleWord(String word)
    {
       String scrambled = "";
       int i=0;
       while(i<word.length())
       {
           if(i==word.length()-1)
           {
               scrambled += word.substring(i,i+1);
               i++;
           }
           else
           {
               String letter = word.substring(i, i+1);
               String nextLetter = word.substring(i+1,i+2);
               if(letter.equals("A") && !nextLetter.equals("A"))
               {
                   scrambled += nextLetter+letter;
                   i+=2;
               }
               else
               {
                   scrambled += letter;
                   i++;
               }
           }
       }
       return scrambled;
    }

    public static void scrambleOrRemove(List<String> wordList)
    {
        int i=0;
        while(i<wordList.size())
        {
            String word = wordList.get(i);
            String scrambled = scrambleWord(word);
            if(!word.equals(scrambled))
            {
                wordList.set(i,scrambled);
                i++;
            }
            else
            {
                wordList.remove(i);
            }
        }
    }
}
