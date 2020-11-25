/* Александр Чесноков*/
/* alex.edkiy@gmail.com*/
/* Результат заданий см. в консоли*/

package lesson1;

public class Main {
    public static void main(String[] args) {

        /* Создаем переменные и инициализируем их значения*/
        byte    byteVar = 111;
        short   shortVal = 22222;
        int     a, b, c, d = 0; // Для следующей задачки
        long    longVal = 100000L;
        float   floatVal = 55.55f;
        double  doubleVal = -33.333;
        char    charVal = 'A';
        boolean boolVal = true;
        String strVal = "Тимофей";

        // Задание №7 (Приветствие)
        Greeting(strVal);

        // Изменение значений переменных и вызов метода для расчета "a * (b + (c / d))"
        a = 5; b = 5; c = -10; d = 5;
        int calcRes = calcExpression (a, b, c, d);
        System.out.println (a+" * ("+b+" + "+"("+c+" / "+d+")) = "+calcRes);

        // Вызов метода метода проверяющего, что сумма двух входящих чисел лежит в пределах от 10 до 20(включительно)
        boolVal = lieWithin (a, b);
        if (boolVal) {
            System.out.println ("Сумма чисел "+a+" и "+b+" лежит в интервале от 10 до 20(включительно)");
        } else {
            System.out.println ("Сумма чисел "+a+" и "+b+" лежит вне интервала от 10 до 20(включительно)");
        }

        // Вызов метода отпределяющего положительное или отрицательное число ему передали
        SignOfANumber(c);

        // Вызов метода подтверждающего, что передаваемое ему число - отрицательное!
        int negativeNum = -33; // Переопределяем переменную, чтобы не было пересечений с пред заданиями
        if (isMinus(negativeNum)) System.out.println (negativeNum+" - Число действительно отрицательное!");
        else System.out.println (negativeNum+" - Число положительное!");

        // Вызов метода, определяющего высокосный год или нет
        int year = 2000; // Задаем год, для проверки
        isLeapYear(year);
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0 && year % 500 == 0) System.out.println ("Год "+year+" - високосный!");
        else System.out.println ("Год "+year+" - НЕ високосный");
    }

    // Метод, возвращающий true, если передаваемый параметр отрицательное целое число
    private static boolean isMinus(int Negative) {
        boolean res = Negative < 0;
        return res;
    }

    // Метод отпределяющий положительное или отрицательное число ему передали. Выводит результат в консоль.
    private static void SignOfANumber(int Num) {
        if (Num >=0) System.out.println ("Число "+Num+" - положительное");
        else System.out.println ("Число "+Num+" - отрицательное");
    }

    // Метод выводящий приветствие по переданной строке
    private static void Greeting(String strVal) {
        System.out.println ("Привет "+strVal+"!");
    }

    // Метод проверяющий, что сумма двух входящих чисел лежит в пределах от 10 до 20(включительно)
    private static boolean lieWithin(int a, int b) {
        int j = a+b;
        if (j >= 10 && j <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    // Метод вычисляющий выражение a * (b + (c / d))
    private static int calcExpression (int a, int b, int c, int d) {
        int i;
        i = a * (b + (c / d));
        return i;
    }
}
