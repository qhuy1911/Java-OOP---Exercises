package test.exercise3;

import main.exercise3.*;

import java.util.ArrayList;
import java.util.List;

/**
 * AnimalTest class
 *
 * @author intern.npqhuy
 */
public class AnimalTest {

    /**
     * Calculate the average age of list animal
     *
     * @param animals: list of animals
     * @return the average age of list animal
     */
    public static float averageAge(List<Animal> animals) {
        float sumAge = 0;
        for (Animal animal : animals) {
            sumAge += animal.getAge();
        }
        return sumAge / animals.size();
    }

    public static void main(String[] args) {
        List<Animal> dogs = new ArrayList<>();
        dogs.add(new Dog("Lulu", 1, SEX.MALE));
        dogs.add(new Dog("Kiki", 1, SEX.FEMALE));
        dogs.add(new Dog("Loki", 3, SEX.MALE));
        // Average age of dogs
        System.out.println("- Average age of dogs: " + averageAge(dogs));

        List<Animal> frogs = new ArrayList<>();
        frogs.add(new Frog("Fro", 2, SEX.FEMALE));
        frogs.add(new Frog("Rof", 4, SEX.MALE));
        frogs.add(new Frog("For", 3, SEX.FEMALE));
        // Average age of frogs
        System.out.println("- Average age of frogs: " + averageAge(frogs));

        List<Animal> kittens = new ArrayList<>();
        kittens.add(new Kitten("Nami", 3));
        kittens.add(new Kitten("Main", 1));
        kittens.add(new Kitten("Naim", 5));
        // Average age of kittens
        System.out.println("- Average age of kittens: " + averageAge(kittens));

        List<Animal> tomcats = new ArrayList<>();
        tomcats.add(new Tomcat("Tom", 5));
        tomcats.add(new Tomcat("Jerry", 2));
        tomcats.add(new Tomcat("Tommy", 5));
        // Average age of tomcats
        System.out.println("- Average age of tomcats: " + averageAge(tomcats));
    }
}
