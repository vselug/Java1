package lesson6.Animals;

public class Dog extends Animal {

    protected boolean bone = false;
    protected String name;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public Dog(String name, String color, int age, boolean bone) {
        super(name, color, age);
        this.bone = bone;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return  super.toString() + " bone=" + bone + '}' + "dog's name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Гау гау");
    }
}
