package animals;

import java.util.Objects;

public class Flying extends Bird {
    private final boolean typeOfMovement;

    public Flying(String name, int age, String livingEnvironment, boolean typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public void walk() {
    }

    public boolean isTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return isTypeOfMovement() == flying.isTypeOfMovement();
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
