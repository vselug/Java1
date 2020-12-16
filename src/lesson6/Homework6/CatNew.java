package lesson6.Homework6;

public class CatNew extends AnimalsNew {

    public CatNew(String nameAnimal, String typeAnimal, int lengthRun, double heightJump) {
        super(nameAnimal, typeAnimal, lengthRun, heightJump);
    }


    @Override
    boolean runAnimal(int length) {
        if (length < 200) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean jumpAnimal(double height) {
        if (height <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
