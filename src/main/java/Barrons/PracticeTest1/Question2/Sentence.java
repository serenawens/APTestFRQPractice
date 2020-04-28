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

    public String[] getWordsA() {
        String[] wordList = new String[countWords()];
        List<Integer> blanks = getBlankPositions();
        int listIndex = 0;
        // if there's no blanks, single word
        if (blanks.size() == 0) {
            wordList[listIndex] = sentence;
            return wordList;
        }
        int curr = 0;
        for (int b : blanks) {
            wordList[listIndex] = sentence.substring(curr, b);
            curr = b + 1;
            listIndex++;
        }
        wordList[listIndex] = sentence.substring(curr); //ensuring last word is added
        return wordList;
    }

    public String[] getWords() {
        String[] wordList = new String[countWords()];
        int listInd = 0;
        String word = "";
        for (int i = 0; i < sentence.length(); i++) { //traverse letters
            String letter = sentence.substring(i, i + 1);
            if (!letter.equals(" ")) { //if there is no space there
                word += letter; //add to current word
                if (i == sentence.length() - 1) {
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
