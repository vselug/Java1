package lesson6.Homework6;

public class DogNew extends AnimalsNew {

    public int lengthSwim;

    public DogNew(String nameAnimal, String typeAnimal, int lengthRun, double heightJump) {
        super(nameAnimal, typeAnimal, lengthRun, heightJump);
    }

    public DogNew(String nameAnimal, String typeAnimal, int lengthRun, double heightJump, int lengthSwim) {
        super(nameAnimal, typeAnimal, lengthRun, heightJump);
        this.lengthSwim = lengthSwim;
    }

    @Override
    boolean runAnimal(int length) {
        if (length < 500) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean jumpAnimal(double height) {
        if (height <= 0.5) {
            return true;
        } else {
            return false;
        }
    }

    // А собаки еще умеют плавать
    boolean swimAnimals(int lengthSwim) {
        if (lengthSwim <= 10) {
            return true;
        } else {
            return false;
        }
    }

    // Возвращаем рандомную дистацию для разных собак
    static int getDistance () {
        int distance = 0;

        distance = Math.random() > 0.5 ? 400 : 600;

        return distance;
    }

    @Override
    public String toString() {
        return typeAnimal + " " + nameAnimal + ", побежал на " + lengthRun +
                ", и прыгнул на " + heightJump + ", и проплыл на "+lengthSwim;
    }

}
