package main.exercise3;

public class Dog extends Animal {

    public Dog(String name, int age, SEX sex) {
        super(name, age, sex);
    }

    @Override
    public void sound() {
        System.out.println("Gau gau...");
    }
}
