package main.exercise2;

/**
 * Student class
 *
 * @author intern.npqhuy
 */
public class Student extends Human {
    private int grade;

    /**
     * Init Student object
     *
     * @param firstName
     * @param lastName
     * @param grade
     */
    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    /**
     * Get the grade of the student
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Set the grade of the student
     *
     * @param grade: the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Convert Student to String
     *
     * @return String of the student
     */
    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                "grade=" + grade +
                '}';
    }
}
