package main.exercise3;

/**
 * Cat abstract class
 *
 * @author intern.npqhuy
 */
public abstract class Cat extends Animal {
    /**
     * Init Cat object
     *
     * @param name
     * @param age
     * @param sex
     */
    public Cat(String name, int age, SEX sex) {
        super(name, age, sex);
    }
}
