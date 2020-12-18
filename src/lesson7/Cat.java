package lesson7;

public class Cat {

    protected String name;
    protected int appetit;
    protected boolean satiety;

    public Cat(String name, int appetit, boolean satiety) {
        this.name = name;
        this.appetit = appetit;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetit, name)) {
            satiety = true;
            System.out.println("Котик "+ name + " поел, сыт и весел!");
        }

    }
}
