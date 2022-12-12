package animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private final boolean typeOfFood;

    public Herbivore(String name, int age, String livingEnvironment, int movementSpeed, boolean typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
        }

    public boolean isTypeOfFood() {
        return typeOfFood;
    }

    public void pastured() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivore)) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return isTypeOfFood() == herbivore.isTypeOfFood();
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
