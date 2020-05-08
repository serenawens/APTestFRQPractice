package Past_APCS_FRQs_Practice.FRQ2017.Question4;

public class Successors {
    public static Position findPosition(int num, int[][] numArr)
    {
        for(int r = 0; r<numArr.length; r++)
        {
            for(int c= 0; c<numArr[r].length; c++)
            {
                if(numArr[r][c]== num)
                    return new Position(r, c);
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] successor = new Position[intArr.length][intArr[0].length];
        for(int r = 0; r<successor.length; r++)
        {
            for(int c= 0; c<successor[r].length; c++)
            {
                int val = intArr[r][c];
                successor[r][c] = findPosition(val, intArr);
            }
        }
        return successor;
    }
}
