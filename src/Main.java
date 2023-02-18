import animals.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        car audi = new car("AUDI",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "Черный",
                150,
                3.0,
                null,null,null,0,true);
        audi.setRegNumber("а123аа456") ;
        audi.setKey(new car.key(true,true));

        System.out.println(audi);
        System.out.println("");

        train lastochka = new train("Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                3500f,
                3,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);

        train leningrad = new train("Ленинград",
                "D-125",
                2019,
                "Россия",
                null,
                270,
                1700f,
                2,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println("");

        bus cityBus = new bus("МАЗ",
                "1034",
                2008,
                "Минск",
                "синий",
                105);

        bus intercityBuses = new bus("ПАЗ",
                "Вектор",
                2015,
                "Россия",
                "зеленый",
                140);

        bus specialBuses = new bus("ЛИАЗ",
                "525626-20",
                2011,
                "Россия",
                "желтый",
                60);

        System.out.println(cityBus);
        System.out.println(intercityBuses);
        System.out.println(specialBuses);
        System.out.println("");
        audi.refill();
        lastochka.refill();
        cityBus.refill();
        System.out.println("");

        Herbivore gazelle = new Herbivore("Газель", 5, "степь", 80, true);
        Herbivore girrafe = new Herbivore("Жираф", -1, null, 10, true);
        Herbivore horse = new Herbivore("Лошадь", 10, null, 200, true);
        Predator huena = new Predator("Гиена", 15, null, 80, false);
        Predator tiger = new Predator("Тигр", 12, null, 120, false);
        Predator bear = new Predator("Медведь", 20, null, 80, false);
        Amphibian frog = new Amphibian("Лягушка", 1, null);
        Amphibian snake = new Amphibian("Уж пресноводный", 2, null);
        Notflying peacock = new Notflying("Павлин", 3, null, true);
        Notflying penguin = new Notflying("Пингвин", 5, null, true);
        Notflying birdDodo = new Notflying("Птица Додо", 3, null, true);
        Flying seagull = new Flying("Чайка", 2, null, false);
        Flying albatross = new Flying("Альбатрос", 10, null, false);
        Flying falcon = new Flying("Сокол", 15, null, false);



        System.out.println(gazelle);
        gazelle.eat();
        System.out.println(girrafe);
        System.out.println(horse);
        System.out.println(huena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(snake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(birdDodo);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }

}