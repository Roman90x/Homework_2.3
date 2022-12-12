package animals;

import java.util.Objects;

 class Mammal extends animal {
    private final String livingEnvironment;
    private final int movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = name;
        } else {
            this.livingEnvironment = "Данные отсутствуют";
        }
        if (movementSpeed >= 0 && movementSpeed < 150) {
            this.movementSpeed = age;
        } else {
            this.movementSpeed = 0;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void walk() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return getMovementSpeed() == mammal.getMovementSpeed() && getLivingEnvironment().equals(mammal.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment(), getMovementSpeed());
    }

 }

