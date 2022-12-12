package animals;

import java.util.Objects;

class Bird extends animal {
    private final String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
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
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return getLivingEnvironment().equals(bird.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment());
    }


}
