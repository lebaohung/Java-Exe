package main;

import animal.Animal;
import animal.Chicken;
import animal.Tiger;

public class TestChickenAndTiger {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }
    }
}
