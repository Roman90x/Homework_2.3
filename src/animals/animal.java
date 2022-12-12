package animals;

import java.util.Objects;

public abstract class animal {
    private String name;
    private int age;

    public animal(String name, int age) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Данные отсутствуют";
        }

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Мне необходимо кушать");
    }

    public void sleep() {
    }

    public void move() {
        System.out.println("Мне нужно перемещаться");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        animal animal = (animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
