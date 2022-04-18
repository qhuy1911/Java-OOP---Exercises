package main.exercise3;

public class Frog extends Animal {

    public Frog(String name, int age, SEX sex) {
        super(name, age, sex);
    }

    @Override
    public void sound() {
        System.out.println("Opp opp...");
    }
}
