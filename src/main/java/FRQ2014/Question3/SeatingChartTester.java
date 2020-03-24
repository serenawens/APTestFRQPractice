package FRQ2014.Question3;

import java.util.ArrayList;
import java.util.List;

public class SeatingChartTester {
    public static void main(String[] args) {
        List<Student> classroom = new ArrayList<Student>();
        classroom.add(new Student("Karen", 3));
        classroom.add(new Student("Liz", 1));
        classroom.add(new Student("Paul", 4));
        classroom.add(new Student("Lester", 1));
        classroom.add(new Student("Henry", 5));
        classroom.add(new Student("Renee", 9));
        classroom.add(new Student("Glen", 2));
        classroom.add(new Student("Fran", 6));
        classroom.add(new Student("David", 1));
        classroom.add(new Student("Danny", 3));
        SeatingChart room = new SeatingChart(classroom, 3, 4);
        System.out.println(room);
        room.removeAbsentStudents(4);
        System.out.println(room);

    }
}

