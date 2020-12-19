package lesson7;

public class Plate {
    protected int foodPlate;
    protected int requiredQuantity; // Нехватка для кормления

    public Plate(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    // Пополнение еды в миске
    public void addFood(int food) {
        this.foodPlate += food;
    }

    // Обратная связь по миске
    public void printPlateInfo() {
        System.out.println("В миске осталось : "+foodPlate+" еды");
    }

    // Уменьшение еды в миске после еды кота
    public boolean decreaseFood(int food, String name, int appetit) {
        if (foodPlate >= food) {
            this.foodPlate -= food;
            requiredQuantity = 0;
            return true;
        } else {
            requiredQuantity = requiredQuantity+appetit-foodPlate;
            System.out.println("В миске мало еды, всего: "+foodPlate+", а нужно - "+appetit+" / Не хватит покормить "+ name +"!");
            return false;
        }
    }
}
