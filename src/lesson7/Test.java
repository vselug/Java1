package lesson7;

import java.util.Scanner;

public class Test {

    static int amountFood;
    static final Scanner in = new Scanner(System.in);
    static int quit = 0;

    public static void main(String[] args) {

        // Наши коты
        Cat cat1 = new Cat("Мурзик",0,false);
        Cat cat2 = new Cat("Барсик", 0,false);
        Cat cat3 = new Cat("Рыжик", 0,false);

        Plate plate = new Plate(0);

        // Создадим массив котов
        Cat [] cats = {cat1, cat2, cat3};

        // Начальное заполнение миске едой
        System.out.println("Добавим еду в миску. От 10 до 50 еды для "+cats.length+" котов");
        amountFood = in.nextInt();
        plate.addFood(amountFood);

        // Зададим котами аппетит
        setAppetit(cats);

        // Покормим котегов
        while (quit ==0) {
            for (Cat cat : cats) {
                eatCats(cat, plate);
            }

            System.out.println("Для выхода нажмите '1', для продолжения кормления котиков - любую другую цифру!");
            if (in.nextInt() == 1) quit = 1;
        }

        // Выведем инфу по котам
        getInfo(cats);

        //Обратная связь по миске
        plate.printPlateInfo();

    }

    // Метод проверки возможности кормления котов (наличие в миске необходимого кол-ва еды
    private static void eatCats(Cat cats, Plate plate) {
        if (!(cats.eat(plate))) {
            System.out.println("Необходимо добавить в миску для "+cats.name+", минимум -> "+plate.requiredQuantity+" еды! Ожидание ввода...");
            amountFood = in.nextInt();
            plate.addFood(amountFood);
            cats.eat(plate);
        }

    }

    // Метод для установки аппетита котам
    private static void setAppetit(Cat[] cats) {
        int appetitCat;

        System.out.println("Зададим каждому котику аппетит");
        for (Cat cat : cats) {
            System.out.println("Для кота " + cat.name + ", аппетит?");
            cat.appetit = in.nextInt();
        }
    }

    // Вывод информации по котам
    private static void getInfo(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.println("Для кота " + cat.name + ", аппетит = "+cat.appetit);
        }
    }

}
