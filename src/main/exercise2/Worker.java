package main.exercise2;

public class Worker extends Human implements Comparable<Worker> {
    private int weekSalary;
    private int workHoursOfDay;

    public Worker(String firstName, String lastName, int weekSalary, int workHoursOfDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursOfDay = workHoursOfDay;
    }

    public float moneyPerHour() {
        return (float) weekSalary / (float) workHoursOfDay;
    }

    public int getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(int weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkHoursOfDay() {
        return workHoursOfDay;
    }

    public void setWorkHoursOfDay(int workHoursOfDay) {
        this.workHoursOfDay = workHoursOfDay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weekSalary=" + weekSalary +
                ", workHoursOfDay=" + workHoursOfDay +
                ", moneyPerHour=" + this.moneyPerHour() +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return Float.compare(this.moneyPerHour(), o.moneyPerHour());
    }
}
