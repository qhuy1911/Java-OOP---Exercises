package main.exercise3;

public class Tomcat extends Cat {

    public Tomcat(String name, int age, SEX sex) {
        super(name, age, sex);
        this.setSex(SEX.MALE);
    }

    @Override
    public void sound() {
        System.out.println("Meow meow...");
    }
}
