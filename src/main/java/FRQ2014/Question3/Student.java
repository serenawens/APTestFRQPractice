package FRQ2014.Question3;

public class Student {
    private String name;
    private int absenceCount;

    public Student(String student, int absences)
    {
        name = student;
        absenceCount = absences;
    }

    /** Returns the name of this Student. */
    public String getName()
    { return name; }
    /** Returns the number of times this Student has missed class. */
    public int getAbsenceCount()
    { return absenceCount; }
    public String toString()
    {
        return name + ": " + absenceCount;
    }
}
