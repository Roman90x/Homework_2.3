package animals;

import java.util.Objects;

public class Notflying extends Bird {
    private final boolean typeOfMovement;

    public Notflying(String name, int age, String livingEnvironment, boolean typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    private void fly() {
    }

    public boolean isTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notflying)) return false;
        if (!super.equals(o)) return false;
        Notflying notflying = (Notflying) o;
        return isTypeOfMovement() == notflying.isTypeOfMovement();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTypeOfMovement());
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
