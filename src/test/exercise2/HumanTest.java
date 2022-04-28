package test.exercise2;

import main.exercise2.HRUtils;
import main.exercise2.Human;
import main.exercise2.Student;
import main.exercise2.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * HumanTest class
 *
 * @author intern.npqhuy
 */
public class HumanTest {
    public static void main(String[] args) {
        HRUtils hrUtils = new HRUtils();

        //----------------STUDENT----------------
        // Create 10 students
        Student st1 = new Student("Kristal", "Vasile", 9);
        Student st2 = new Student("Ilyse", "Clubley", 2);
        Student st3 = new Student("Marna", "Booty", 10);
        Student st4 = new Student("Karna", "Thrustle", 2);
        Student st5 = new Student("Trula", "Jerrim", 6);
        Student st6 = new Student("Regen", "Birkin", 2);
        Student st7 = new Student("Chuck", "Chuck", 11);
        Student st8 = new Student("Godiva", "Coils", 7);
        Student st9 = new Student("Tabbitha", "Songust", 4);
        Student st10 = new Student("Collen", "Ayling", 3);

        // Initialize a list of 10 students
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);
        studentList.add(st7);
        studentList.add(st8);
        studentList.add(st9);
        studentList.add(st10);

        // Sort list of students by grade in ascending order
        hrUtils.sortByGrade(studentList);

        // Print list of student
        System.out.println("- List of students: ");
        for (Student st :
                studentList) {
            System.out.println("\t" + st);
        }

        //----------------WORKER----------------
        // Create 10 students
        Worker wk1 = new Worker("Cristi", "Hostan", 1395, 50);
        Worker wk2 = new Worker("Carolin", "Stancliffe", 1310, 61);
        Worker wk3 = new Worker("Grete", "Bick", 1158, 50);
        Worker wk4 = new Worker("Patrizio", "Friett", 1000, 38);
        Worker wk5 = new Worker("Jared", "Revett", 1482, 33);
        Worker wk6 = new Worker("Wally", "Ottery", 1469, 52);
        Worker wk7 = new Worker("Galen", "McNab", 1062, 75);
        Worker wk8 = new Worker("Lucille", "McCarthy", 1348, 23);
        Worker wk9 = new Worker("Ludovika", "Brain", 1101, 89);
        Worker wk10 = new Worker("Aristotle", "Marshall", 1483, 79);

        // Initialize a list of 10 students
        List<Worker> workerList = new ArrayList<>();
        workerList.add(wk1);
        workerList.add(wk2);
        workerList.add(wk3);
        workerList.add(wk4);
        workerList.add(wk5);
        workerList.add(wk6);
        workerList.add(wk7);
        workerList.add(wk8);
        workerList.add(wk9);
        workerList.add(wk10);

        // Sort list of students by moneyPerHour in ascending order
        hrUtils.sortByMoneyPerHour(workerList);

        // Print list of student
        System.out.println("- List of workers: ");
        for (Worker wk :
                workerList) {
            System.out.println("\t" + wk);
        }

        //----------------MERGE 2 LISTS----------------
        List<Human> list = new ArrayList<>();
        list.addAll(studentList);
        list.addAll(workerList);

        // sort merged list
        hrUtils.sortByName(list);

        // Print merged list
        System.out.println("- Merge list: ");
        for (Human hm: list) {
            System.out.println("\t" + hm);
        }
    }
}
