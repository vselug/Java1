package lesson6.Animals;

import java.util.Random;

public class Main {



    public static void main(String[] args) {
        Cat cat = new Cat("Мартин");
        Dog dog = new Dog("Гендальф", "Серый", 10, true);
        dog.setName("Фродо");
        Animal duck = new Duck("Дональд Дак");
//        duck.fly();

        int a = 3;
        System.out.println((double) a);

        //new Animal("it");

        System.out.println(cat);
        System.out.println(dog);

        Animal[] animals = {duck, cat, dog};

        for (Animal animal : animals) {
            animal.voice();
            if (animal instanceof Duck) {
                ((Duck)animal).fly();
            }
        }

        Object[] objects = {
            duck,
            new int[]{1, 2, 3},
            new String("Привет"),
            new Random(),
            new Integer(10)
        };

        for (Object object : objects) {
            System.out.println(object);
//            object.
        }

        test(cat);
        test(dog);
        test(duck);
    }

    public static void test(Animal animal) {
        System.out.println("Животного зовут " + animal.name);
    }
}
