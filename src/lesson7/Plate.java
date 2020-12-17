package lesson7;

public class Plate {
    private int food;

    // Пополнение еды
    public void addFood(int food) {
        this.food += food;
    }

    // Обратная связь по миске
    public void printInfo() {
        System.out.println("В миске сейчас : "+food);
    }

    // Уменьшение еды в миске после еды кота
    public void decreaseFood(int food) {
        this.food -= food;
    }
}
