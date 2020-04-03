package animal;

import edible.Endible;

public class Chicken extends Animal implements Endible {
    @Override
    public String makeSound() {
        return "Chicken: cluck cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
