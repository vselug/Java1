package lesson6.Homework6;

public abstract class AnimalsNew {

    protected String nameAnimal;  // Имя животного
    protected String typeAnimal;  // Тип животного
    protected int lengthRun;      // Длина забега
    protected double heightJump;  // Высота прыжка

    public AnimalsNew(String nameAnimal, String typeAnimal, int lengthRun, double heightJump) {
        this.nameAnimal = nameAnimal;
        this.typeAnimal = typeAnimal;
        this.lengthRun = lengthRun;
        this.heightJump = heightJump;
    }

    abstract boolean runAnimal(int length); // Все животные могут бегать
    abstract boolean jumpAnimal(double height); // Все животные могут прыгать

    public void animalInfo () {
        System.out.println("Имя - "+ nameAnimal + ", Животное - " +typeAnimal+", Дина забега = "+lengthRun+
                            ", Высота прыжка = "+heightJump);
    }

    @Override
    public String toString() {
       return typeAnimal + " " + nameAnimal + ", побежал на " + lengthRun +
                   ", и прыгнул на " + heightJump;
    }


 }
