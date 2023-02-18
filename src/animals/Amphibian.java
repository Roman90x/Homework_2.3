package animals;

import java.util.Objects;

public class Amphibian extends animal {
    private final String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = name;
        } else {
            this.livingEnvironment = "Данные отсутствуют";
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunted() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibian)) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return getLivingEnvironment().equals(amphibian.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment());
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
