package lesson5;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мартин Лютер Кот", "Афрокот", 2);
        Cat cat2 = new Cat("Борис", "Рыжий", 3);
        Cat cat3 = new Cat("Шава");

        cat3.setAge(40);

/*        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();

        cat1.voice("Добрый вечер!");
        cat2.voice("И вам доброго!");*/

        Cat.getCatCount();

        Cat[] catArr = {cat1, cat1, cat3};

        for (Cat cat : catArr) {
            cat.printInfo();
        }
    }
}
