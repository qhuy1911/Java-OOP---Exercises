package main.exercise3;

public class Kitten extends Cat{
    public Kitten(String name, int age, SEX sex) {
        super(name, age, sex = SEX.FEMALE);
    }

    @Override
    public void sound() {
        System.out.println("Miu miu...");
    }
}
