package PrincetonReview.DiagnosticTest.Question4;

import java.util.ArrayList;

public class School {
    private ArrayList<Classroom> classes;

    public String findStudent(String teacherName, int studentID)
    {
        String studentName = "";
        for(int i=0; i<classes.size(); i++)
        {
            Classroom classroom = classes.get(i);
            if(teacherName.equals(classroom.getTeacherName()))
            {
                studentName = classroom.find(studentID);
            }
        }
        return studentName;
    }

}
