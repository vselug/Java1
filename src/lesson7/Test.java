package lesson7;

public class Test {
    public static void main(String[] args) {



        Cat cat = new Cat("Мурзик");
        Plate plate = new Plate();

        //Добавить еду в миску
        plate.addFood(10);
        //Кот есть (пригласить кота поесть)
        cat.eat(plate);
        //Обратная связь по миске
        plate.printInfo();

    }

}
