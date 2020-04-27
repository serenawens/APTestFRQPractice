package Barrons.PracticeTest1.Question2;
//22 min

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String sentence;

    public List<Integer> getBlankPositions() {
        ArrayList<Integer> blanks = new ArrayList<Integer>();
        for (int i = 0; i < sentence.length(); i++) {
            String letter = sentence.substring(i, i + 1);
            if (letter.equals(" "))
                blanks.add(i);
        }
        return blanks;
    }

    public int countWords() {
        return getBlankPositions().size() + 1;
    }

    public String[] getWords() {
        String[] wordList = new String[countWords()];
        int listInd = 0;
        String word = "";
        for (int i = 0; i < sentence.length(); i++) { //traverse letters
            String letter = sentence.substring(i, i + 1);
            if (!getBlankPositions().contains(i)) { //if there is no space there
                word += letter; //add to current word
                if (i == 5) {
                    wordList[listInd] = word;
                }
            } else {
                wordList[listInd] = word;
                listInd++;
                word = "";
            }

        }
        return wordList;
    }
}