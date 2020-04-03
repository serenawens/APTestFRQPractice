package StepsToAFiveAlgorithmPractice.BasicQuestion3;

import java.util.ArrayList;

public class FindSogs {
    public static void main(String[] args) {
        String[][]songs = {{"We Are the Champions", "You Shook Me All Night Long", "We Found Love"},
                             {"Bleeding Love", "Stairway to Heaven", "Won't Get Fooled Again"},
                            {"I'd Do Anything For Love", "Stupid Crazy love", "Love in This Club"}};
        //System.out.println(findCount(songs, "Love"));


    }

    public static int findCount(String[][] arr, String target)
    {
        int count=0;
        for(int row=0; row<arr.length; row++)
        {
            for(int col=0; col<arr[0].length; col++)
            {
                if(arr[row][col].contains(target))
                {
                    count++;
                }
            }
        }
        return count;
    }

}
