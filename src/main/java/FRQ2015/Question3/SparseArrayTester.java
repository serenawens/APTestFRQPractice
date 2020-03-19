package FRQ2015.Question3;

public class SparseArrayTester {
    public static void main(String[] args) {
        SparseArray sparse = new SparseArray(6,5);
        SparseArrayEntry entry1 = new SparseArrayEntry(1,4,4);
        SparseArrayEntry entry2 = new SparseArrayEntry(2,0,1);
        SparseArrayEntry entry3 = new SparseArrayEntry(3,1,-9);
        SparseArrayEntry entry4 = new SparseArrayEntry(1,1,5);
        sparse.add(entry1);
        sparse.add(entry2);
        sparse.add(entry3);
        sparse.add(entry4);
        System.out.println(sparse.getValueAt(3,1));
        System.out.println(sparse.getValueAt(1,1));
        System.out.println(sparse.getNumCols());
        sparse.removeColumn(1);
        System.out.println(sparse.getValueAt(3,1));
        System.out.println(sparse.getValueAt(1,1));
        System.out.println(sparse.getNumCols());

    }
}
