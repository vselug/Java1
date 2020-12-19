package lesson5.am.dir1;

public class CatNew {

    public  String name;  // Доступно везде
            String color; // Доступно в классе и пакете

    protected int age; // Доступно в классе, пакете, классе-наследнике
    private int weight; // Доступно только в рамках своего класса

    void foo () {
        name = "A";
        color = "red";
        age = 2;
    }

}
