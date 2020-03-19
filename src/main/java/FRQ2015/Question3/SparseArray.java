package FRQ2015.Question3;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;

    public SparseArray(int numRows, int numCols)
    {
        entries = new ArrayList<SparseArrayEntry>();
        this.numCols = numCols;
        this.numRows = numRows;
    }

    public void add(SparseArrayEntry entry) {
        entries.add(entry);
    }

    public int getNumRows()
    {return numRows;}

    public int getNumCols()
    {return numCols;}

    /** Returns the value of the element at row index ROW and column index COL in the sparse array
     *  Precondition: 0<=row<getNumRows()
     *                0<=col<getColRows()
     */
    public int getValueAt(int row, int col)
    {
        for(SparseArrayEntry obj1 : entries)
        {
            if(obj1.getCol()==col && obj1.getRow()==row)
            {
                return obj1.getValue();
            }
        }
        return 0;
    }

    /** Removes the column col from the sparse array
     * PreconditionL 0<=col<getNumCols()
     */
    public void removeColumn(int col) {
        List<SparseArrayEntry> newEntries = new ArrayList<SparseArrayEntry>();
        int c=numCols;
        for (SparseArrayEntry obj1 : entries)
        {
            //if col =1 then leave it empty
            if(obj1.getCol()==col)
            {
                if(numCols==c)
                {
                    numCols--;
                }

            }
            //if col  != then replace it with the needed value
            else if(obj1.getCol()!=col)
            {
                newEntries.add(obj1);
            }
            // if col of the object is greater than the given column and numCols has been changed,
            //then the object's column needs to be reset to one less
            if(obj1.getCol()>col && numCols<c)
            {
                obj1.setCol(obj1.getCol()-1);
                newEntries.add(obj1);
            }
        }
        entries = newEntries;

        /*int length = newEntries.size();
        for (int i=0; i<length; i++)
        {
            if (entries.size()< length )
            {
                length--;
                i--;
            }
            SparseArrayEntry obj1 = entries.get(i);
            if(obj1.getCol()==col)
            {
                entries.remove(entries.get(i));
                numCols--;
            }
            else if(obj1.getCol()>col&&numCols<c)
            {
                entries.get(i).setCol(obj1.getCol()-1);
            }
        }
         */
    }
}
