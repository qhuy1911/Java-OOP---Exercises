package main.exercise3;

/**
 * Frog class
 *
 * @author intern.npqhuy
 */
public class Frog extends Animal {

    /**
     * Init Frog object
     *
     * @param name
     * @param age
     * @param sex
     */
    public Frog(String name, int age, SEX sex) {
        super(name, age, sex);
    }

    /**
     * Get sound of frog
     *
     * @return sound of frog
     */
    @Override
    public String sound() {
        return  "Opp opp...";
    }
}
