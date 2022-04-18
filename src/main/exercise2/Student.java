package main.exercise2;

public class Student extends Human implements Comparable<Student> {
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.grade);
    }
}
