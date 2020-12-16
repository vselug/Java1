package lesson6.Homework6;

public class MainHome {

    public static void main(String[] args) {

        CatNew cat = new CatNew("Рыжик", "Кот", 100,2.2);
        DogNew dog = new DogNew("Верный", "Пес", DogNew.getDistance(),10,8);

        //cat.animalInfo();
        //dog.animalInfo();

        goCat(cat);
        goDog(dog);

    }

    // "Запускаем" котика
    private static void goCat(CatNew cat) {
        System.out.println(cat + " || результат = " + cat.runAnimal(cat.lengthRun) + " / " +
                cat.jumpAnimal(cat.heightJump));
    }

    // "Запускаем" песика
    private static void goDog(DogNew dog) {
        System.out.println(dog + " || результат = " + dog.runAnimal(dog.lengthRun) + " / " +
                dog.jumpAnimal(dog.heightJump) + " / " + dog.swimAnimals(dog.lengthSwim));
    }
}


