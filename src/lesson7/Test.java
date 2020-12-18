package lesson7;

import java.util.Scanner;

public class Test {

    static int amountFood;
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Наши коты
        Cat cat1 = new Cat("Мурзик",0,false);
        Cat cat2 = new Cat("Барсик", 0,false);
        Cat cat3 = new Cat("Рыжик", 0,false);

        Plate plate = new Plate();

        // Создадим массив котов
        Cat [] cats = {cat1, cat2, cat3};

        //Добавить еду в миску
        System.out.println("Добавим еду в миску. От 10 до 50 еды для "+cats.length+" котов");
        amountFood = in.nextInt();
        plate.addFood(amountFood);

        // Зададим котами аппетит
        setAppetit(cats);

        // Выведем инфу по котам
        // getInfo(cats);

        //Кот есть (пригласить кота поесть)
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        //Обратная связь по миске
        plate.printInfo();
    }

    // Вывод информации по котам
    private static void getInfo(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.println("Для кота " + cat.name + ", аппетит = "+cat.appetit);
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

}
