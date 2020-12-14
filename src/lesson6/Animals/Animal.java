package lesson6.Animals;

public abstract class Animal {

    protected String name;
    private String color;
    protected int age;

    public String getColor() {
        return color;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name) {
        this(name, "серобурмалиновый", 0);
    }


    @Override
    public String toString() {
//        System.out.println(super.toString());
        return "Animal{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + '}';
    }

    public abstract void voice();


}
