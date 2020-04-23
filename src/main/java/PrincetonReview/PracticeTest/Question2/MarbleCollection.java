package PrincetonReview.PracticeTest.Question2;

import java.util.List;

public class MarbleCollection {
    private List<MarbleSet> sets;

    public int getTotalMarbles() {
        int total = 0;
        for (MarbleSet set : sets) {
            total += set.getNumber();
        }
        return total;
    }

    public int removeColor(String marbleCol) {
        int removeCount = 0;
        for (int i = 0; i < sets.size(); i++) //traverseSets
        {
            MarbleSet set = sets.get(i);
            if (set.getColor().equals(marbleCol)) //find a marbleSet that is that color
            {
                removeCount++; //add to the remove count
                sets.remove(i); //remove from the Sets
                i--; //subtract one to make up for loss
            }
        }
        return removeCount;
    }

}
