package PrincetonReview.DiagnosticTest.Question4;

public class Student {
    private int studentID;
    private String studentName;
    public Student(String name, int idNum)
    {
        studentID = idNum;
        studentName = name;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getStudentID() {
        return studentID;
    }
}
