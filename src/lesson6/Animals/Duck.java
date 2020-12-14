package lesson6.Animals;

public class Duck extends Animal {
    public Duck(String name, String color, int age) {
        super(name, color, age);
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Кря кря");
    }

    public void fly() {
        System.out.println("I can fly!");
    }
}
