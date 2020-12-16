package lesson5;

import java.util.Locale;

public class Cat {

    protected String name;
    protected String color;
    private int age;
    private static int catCount;

    public static void getCatCount () {
        System.out.println("Количество"+catCount);
    }

    public Cat(String name, String color, int age) {
        this.name = name != null ? name.toUpperCase(): null;
        this.color = color != null ? color.toUpperCase() : null;
        this.age = age;

        catCount++;
    }

    public Cat(String name) {
        this (name, null, 0);
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public void voice (String word) {
        System.out.printf("Кот %s сказал: %s", name, word);
    }

    public void setAge(int age) {

        if (age >= 0 && age < 30) {
            this.age = age;
        } else {
            System.err.println("Неверный возраст!");
        }
    }
}
