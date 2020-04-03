package FRQ2015Again.Question3;

public class SparseArrayTest {
    public static void main(String[] args) {
        SparseArray entries = new SparseArray();
        entries.add(new SparseArrayEntry(1,4,4));
        entries.add(new SparseArrayEntry(2,0,1));
        entries.add(new SparseArrayEntry(3,1,-9));
        entries.add(new SparseArrayEntry(1,1,5));
        System.out.println(entries);
        System.out.println(entries.getValueAt(3,1));
        System.out.println(entries.getValueAt(3,3));
        entries.removeColumn2(1);
        System.out.println(entries);
    }
}
