package ru.mirea.lab2.task5;

import ru.mirea.lab2.task1.Author;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        DogKennel Kennel = new DogKennel();

        Dog dog1 = new Dog("reks", 5);
        Dog dog2 = new Dog("Bobik", 4);

        Kennel.addDog(dog1);
        Kennel.addDog(dog2);

        List<Dog> dogs = Kennel.getAllDogs();
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
            System.out.println("Human age: " + dog.HumanAge() + " years");
        }
    }
}