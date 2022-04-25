package main.exercise3;

/**
 * Kitten class
 *
 * @author intern.npqhuy
 */
public class Kitten extends Cat{
    /**
     * Init Kitten Object
     *
     * @param name
     * @param age
     * @param sex
     */
    public Kitten(String name, int age, SEX sex) {
        super(name, age, sex);
    }

    /**
     * Init Kitten object
     *
     * @param name
     * @param age
     */
    public Kitten(String name, int age) {
        super(name, age, SEX.FEMALE);
    }

    /**
     * Get sound of kitten
     *
     * @return sound of kitten
     */
    @Override
    public String sound() {
        return  "Miu miu...";
    }
}
