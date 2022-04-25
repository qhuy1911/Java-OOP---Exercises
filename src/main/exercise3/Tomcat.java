package main.exercise3;

/**
 * Tomcat class
 *
 * @author intern.npqhuy
 */
public class Tomcat extends Cat {

    /**
     * Init Tomcat Object
     *
     * @param name
     * @param age
     * @param sex
     */
    public Tomcat(String name, int age, SEX sex) {
        super(name, age, sex);
    }

    /**
     * Init Tomcat object
     *
     * @param name
     * @param age
     */
    public Tomcat(String name, int age) {
        super(name, age, SEX.MALE);
    }

    /**
     * Get sound of Tomcat
     *
     * @return sound of Tomcat
     */
    @Override
    public String sound() {
        return "Meow meow...";
    }
}
