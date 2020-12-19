package lesson5;

public class Main {

    public static void main(String[] args) {

        // Про кошек
        Cat cat1 = new Cat("Мартин Лютер Кот", "Афрокот", 2);
        Cat cat2 = new Cat("Борис", "Рыжий", 3);
        Cat cat3 = new Cat("Шава");

        //cat3.setAge(40);
        //Cat.getCatCount();

        Cat[] catArr = {cat1, cat1, cat3};

        for (Cat cat : catArr) {
            //cat.printInfo();
        }

        // Про сотрудников
        Employee emp1 = new Employee("Иванов И.И", "Сисадмин", "ivanii@mail.ru",
                    "+7(911) 223-33-23",80000,35);
        Employee emp2 = new Employee("Петров А.И", "Менеджер", "petrova@mail.ru",
                "+7(904) 111-33-23",70000,30);
        Employee emp3 = new Employee("Михельсон С.С", "Директор", "boss@mail.ru",
                "+7(905) 222-22-22",100500,50);
        Employee emp4 = new Employee("Блестящая И.И", "Секретать", "blesk@mail.ru",
                "+7(903) 444-33-23",50000,25);
        Employee emp5 = new Employee("Толстова Г.С", "Бухгалтер", "tolstova@mail.ru",
                "+7(911) 225-66-77",90000,45);

        Employee[] empArr = {emp1, emp2, emp3, emp4, emp5};

        for (Employee employee : empArr) {
            if (employee.age > 40) {
                employee.printEmpInfo();
            }
        }

    }
}
