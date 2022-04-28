package main.exercise2;

/**
 * Human abstract classs
 *
 * @author intern.npqhuy
 */
public abstract class Human{
    private String firstName;
    private String lastName;

    /**
     * Init Human object
     *
     * @param firstName: the first name of the human
     * @param lastName: the last name of the human
     */
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get the first name of the human
     *
     * @return the first name of the human
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the first name of the human
     *
     * @param firstName: the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the last name of the human
     *
     * @return the last name of the human
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name of the human
     *
     * @param lastName: the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
