package main.exercise3;

/**
 * Animal abstract class
 *
 * @author intern.npqhuy
 */
public abstract class Animal implements ISound {
    private String name;
    private int age;
    private SEX sex;

    /**
     * Init Animal object
     *
     * @param name
     * @param age
     * @param sex
     */
    public Animal(String name, int age, SEX sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * Get the name of animal
     *
     * @return the name of animal
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of animal
     *
     * @param name: the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the age of animal
     *
     * @return the age of animal
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of animal
     *
     * @param age: the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the sex of animal
     *
     * @return the sex of animal
     */
    public SEX getSex() {
        return sex;
    }

    /**
     * Set the sex of animal
     *
     * @param sex: the sex to set
     */
    public void setSex(SEX sex) {
        this.sex = sex;
    }

    /**
     * Convert Animal to String
     *
     * @return String of Animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
