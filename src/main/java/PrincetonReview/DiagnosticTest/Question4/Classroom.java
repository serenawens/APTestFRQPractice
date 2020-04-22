package PrincetonReview.DiagnosticTest.Question4;

import java.util.ArrayList;

public class Classroom {
    private String teacherName;
    private ArrayList<Student> students;

    public String getTeacherName()
    {return teacherName;}

    public String find(int idNum)
    {
        int l = 0;
        int h = students.size()-1;
        while(l<=h)
        {
            int m = (l+h)/2;
            if(students.get(m).getStudentID()==idNum)
            {
                return students.get(m).getStudentName();
            }
            else if(students.get(m).getStudentID()<idNum)
            {
                l = m+1;
            }
            else
            {
                h = m-1;
            }
        }
        return "STUDENT NOT FOUND";
    }



}
