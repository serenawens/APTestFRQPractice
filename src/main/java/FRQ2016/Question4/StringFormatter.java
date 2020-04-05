package FRQ2016.Question4;

import java.util.ArrayList;
import java.util.List;

public class StringFormatter {
    public static void main(String[] args)
    {
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("FIVE");
        wordList.add("FOUR");
        wordList.add("LOVE");
        wordList.add("MARK");
        wordList.add("MINE");
        System.out.println(format(wordList, 24));
    }

    public static int totalLetters(List<String> wordList)
    {
        int lettersCount=0;
        for(String word: wordList)
        {
            lettersCount+=word.length();
        }
        return lettersCount;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen)
    {
        int spaces =formattedLen-totalLetters(wordList);
        return spaces/(wordList.size()-1);
    }

    public static String format(List<String> wordList, int formattedLen)
    {
        String formattedWord = "";
        ArrayList<String> wordFormat = new ArrayList<String>();
        int basicGapWidth = basicGapWidth(wordList,formattedLen);
        int leftover = leftoverSpaces(wordList,formattedLen);
        for(int i=0; i<wordList.size(); i++)
        {
            wordFormat.add(wordList.get(i));
            if(i!=wordList.size()-1)
            {
                int k=0;
                while(k<basicGapWidth)
                {
                    wordFormat.add("-");
                    k++;
                }
                if(leftover>0)
                {
                    wordFormat.add("-");
                    leftover--;
                }
            }
        }
        for(String str: wordFormat)
        {
            formattedWord += str;
        }
        return formattedWord;
    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen)
    {
        int spaces =formattedLen-totalLetters(wordList);
        return spaces%(wordList.size()-1);
    }



}
