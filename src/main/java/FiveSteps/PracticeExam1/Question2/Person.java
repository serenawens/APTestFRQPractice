package FiveSteps.PracticeExam1.Question2;

public class Person {
    private String name;
    private int age;

    public Person(String myName, int myAge) {
        name = myName;
        age = myAge;
    }

    public boolean matches(Person p) {
        return p.getName().equals(this.getName()) && (p.getAge() == this.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
