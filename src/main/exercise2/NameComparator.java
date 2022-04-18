package main.exercise2;

import java.util.Comparator;

public class NameComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getFirstName().compareTo(o2.getFirstName()) != 0) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        } else {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
