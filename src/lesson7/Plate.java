package lesson7;

public class Plate {
    private int foodPlate;

    // Пополнение еды в миске
    public void addFood(int food) {
        this.foodPlate += food;
    }

    // Обратная связь по миске
    public void printInfo() {
        System.out.println("В миске сейчас : "+foodPlate);
    }

    // Уменьшение еды в миске после еды кота
    public boolean decreaseFood(int food, String name) {
        if (foodPlate >= food) {
            this.foodPlate -= food;
            return true;
        } else {
            System.out.println("В миске мало еды, не хватит покормить "+ name +". Нужно насыпать еще!");
            return false;
        }
    }
}
