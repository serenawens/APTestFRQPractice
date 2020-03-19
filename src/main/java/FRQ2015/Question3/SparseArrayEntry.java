package FRQ2015.Question3;

public class SparseArrayEntry {
    private int row;
    private int col;
    private int value;

    // row index-r...column index-c...containing value-v
    public SparseArrayEntry(int r, int c, int v)
    {
        row =r;
        col =c;
        value =v;
    }
    public int getRow()
    {return row;}

    public int getCol()
    {return col;}

    public int getValue()
    {return value;}

    public void setRow(int r)
    {row =r;}
    public void setCol(int c)
    {col =c;}
}
