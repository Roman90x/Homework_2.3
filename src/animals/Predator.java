package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private final boolean typeOfFood;

    public Predator(String name, int age, String livingEnvironment, int movementSpeed, boolean typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public void hunted() {
    }

    public boolean isTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator)) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return isTypeOfFood() == predator.isTypeOfFood();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTypeOfFood());
    }
    @Override
    public void eat() {
        System.out.println("Я кушаю!");
    }

    @Override
    public void move() {
        System.out.println("Я перемещаюсь!");
    }
}
