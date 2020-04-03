package FRQ2015Again.Question3;
// 12 minutes is the time taken
import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    /** The number of rows and columns in the sparse array. */
    private int numRows;
    private int numCols;

    /** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
     * list in no particular order. Each non-zero element is represented by exactly one entry in the list.*/
    private List<SparseArrayEntry> entries;

    /** Constructs an empty SparseArray. */
    public SparseArray()
    {

        entries = new ArrayList<SparseArrayEntry>();
    }

    public void add(SparseArrayEntry entry)
    {
        entries.add(entry);
    }

    public String toString()
    {
        String list = entries.toString();
        return list;
    }


    /** Returns the number of rows in the sparse array. */
    public int getNumRows()
    { return numRows; }

    /** Returns the number of columns in the sparse array. */
    public int getNumCols()
    { return numCols; }

    /** Returns the value of the element at row index row and column index col in the sparse array.
     * Precondition: 0  row < getNumRows()
     * 0  col < getNumCols()*/
    public int getValueAt(int row, int col)
    {
        //took 3 minutes
        for(SparseArrayEntry entry : entries)
        {
            if(entry.getRow() ==row && entry.getCol()==col)
            {
                return entry.getValue();
            }
        }
        return 0;
    }

    public void removeColumn2(int col)
    {
        ArrayList<SparseArrayEntry> edited = new ArrayList<SparseArrayEntry>();
        int i=0;
        while(i<entries.size())
        {
            SparseArrayEntry entry =entries.get(i);
            if(entry.getCol()==col)
            {
                i++;
            }
            else if(entry.getCol()>col)
            {
                edited.add(new SparseArrayEntry(entry.getRow(), entry.getCol()-1, entry.getValue()));
                i++;
            }
            else
            {
                edited.add(entry);
                i++;
            }
        }
        numCols--;
        entries = edited;
    }

    /** Removes the column col from the sparse array.
     * Precondition: 0  col < getNumCols()*/
    public void removeColumn1(int col)
    {
        /**
         *  1.Column is removed
         * 2. Columns that are greater than int col must subtract 1
         * 3. subtract from the number of columnns of the object SparseArray
         */
        int i=0;

        while(i<entries.size())
        {
            SparseArrayEntry entry = entries.get(i);
            if(entry.getCol()==col)
            {
                entries.remove(i);
            }
            else if(entry.getCol()>col)
            {
                int row = entry.getRow();
                int newCol = entry.getCol()-1;
                int val = entry.getValue();
                entries.remove(i);
                entries.add(i, new SparseArrayEntry(row, newCol, val));
                i++;
            }
            else
            {
                i++;
            }
        }
        numCols--;
    }
}
