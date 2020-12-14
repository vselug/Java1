package lesson5;

public class Employee {

    protected String fullName;
    protected String position;
    protected String email;
    protected String tel;
    protected int salary;
    protected int age;

    public Employee(String fullName, String position, String email, String tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

        /*System.out.println("Сотрудник {" +
                "ФИО '" + fullName + '\'' +
                ", Должность = '" + position + '\'' +
                ", Почта = '" + email + '\'' +
                ", Тел: '" + tel + '\'' +
                ", ЗП = " + salary +
                ", Возраст = " + age +
                '}');*/
    }

    public void printEmpInfo() {
        System.out.println("Сотрудник {" +
                "ФИО ='" + fullName + '\'' +
                ", Должность ='" + position + '\'' +
                ", Почта = '" + email + '\'' +
                ", Тел: '" + tel + '\'' +
                ", ЗП =" + salary +
                ", Возраст =" + age +
                '}');
    }
}
