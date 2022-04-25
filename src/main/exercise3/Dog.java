package main.exercise3;

/**
 * Dog class
 *
 * @author intern.npqhuy
 */
public class Dog extends Animal {

    /**
     * Init Dog object
     *
     * @param name
     * @param age
     * @param sex
     */
    public Dog(String name, int age, SEX sex) {
        super(name, age, sex);
    }

    /**
     * Get sound of dog
     *
     * @return sound of dog
     */
    @Override
    public String sound() {
        return "Gau gau...";
    }
}
