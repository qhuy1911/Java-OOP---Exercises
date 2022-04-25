package main.exercise2;

/**
 * Worker class
 *
 * @author intern.npqhuy
 */
public class Worker extends Human{
    private int weekSalary;
    private int workHoursOfDay;

    /**
     * Init Worker object
     *
     * @param firstName
     * @param lastName
     * @param weekSalary
     * @param workHoursOfDay
     */
    public Worker(String firstName, String lastName, int weekSalary, int workHoursOfDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursOfDay = workHoursOfDay;
    }

    /**
     * Calculate money per hour of the worker
     *
     * @return the money per hour of the worker
     */
    public float moneyPerHour() {
        return (float) weekSalary / (float) workHoursOfDay;
    }

    /**
     * Get the week salary of the worker
     *
     * @return the week salary of the worker
     */
    public int getWeekSalary() {
        return weekSalary;
    }

    /**
     * Set the week salary of the worker
     *
     * @param weekSalary: the week salary to set
     */
    public void setWeekSalary(int weekSalary) {
        this.weekSalary = weekSalary;
    }

    /**
     * the work hours of day of the worker
     *
     * @return the work hours of day of the worker
     */
    public int getWorkHoursOfDay() {
        return workHoursOfDay;
    }

    /**
     * Set the work hours of day of the worker
     *
     * @param workHoursOfDay the work hours of day to set
     */
    public void setWorkHoursOfDay(int workHoursOfDay) {
        this.workHoursOfDay = workHoursOfDay;
    }

    /**
     * Convert Worker to String
     *
     * @return String of Worker
     */
    @Override
    public String toString() {
        return "Worker{" +
                " firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", weekSalary=" + weekSalary +
                ", workHoursOfDay=" + workHoursOfDay +
                ", moneyPerHour=" + this.moneyPerHour() +
                '}';
    }
}
