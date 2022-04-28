package main.exercise2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * HRUtils class
 *
 * @author intern.npqhuy
 */
public class HRUtils {

    /**
     * Sort the student list by grade in ascending order
     *
     * @param studentList: list student to sort
     */
    public void sortByGrade(List<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getGrade(), o2.getGrade());
            }
        });
    }

    /**
     * Sort the worker list by money per hour in ascending order
     *
     * @param workerList: list worker to sort
     */
    public void sortByMoneyPerHour(List<Worker> workerList) {
        Collections.sort(workerList, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return Float.compare(o1.moneyPerHour(), o2.moneyPerHour());
            }
        });
    }

    /**
     * Sort the human list by name in ascending order
     *
     * @param humanList: list human to sort
     */
    public void sortByName(List<Human> humanList) {
        Collections.sort(humanList, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o1.getFirstName().compareTo(o2.getFirstName()) != 0) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                } else {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            }
        });
    }
}
