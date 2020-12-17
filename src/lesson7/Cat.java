package lesson7;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(7); // 5-ромашка, семь (просто число)
    }
}
