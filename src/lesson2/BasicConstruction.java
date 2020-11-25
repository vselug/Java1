/* Александр Чесноков*/
/* alex.edkiy@gmail.com*/
/* Результат заданий см. в консоли*/

package lesson2;

public class BasicConstruction {
    public static void main(String[] args) {

        final int SIZE01 = 10; // Задаем константой размер массива из 0 и 1
        final int SIZE02 = 8;  // Задаем константой размер массива для 2-й задачи
        final int SIZEA = 6; // Задаем константой размер двумерного массива SIZEA x SIZEB
        final int SIZEB = 6; // Задаем константой размер двумерного массива SIZEA x SIZEB

        /* Задача 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        С помощью цикла и условия заменить 0 на 1, 1 на 0 */
        System.out.println("Массив из 0 и 1, ДО сортировки:");
        int [] arrNum = getRandomArr01 (SIZE01); // Вызываем метод генерации массива со случайным набором 0 и 1
        int [] arrSort = new int[SIZE01]; // Создаем новый массив для записи сортированных значений
        int i = 0;

        System.out.printf("%nМассив ПОСЛЕ замены 0 на 1:%n");
        while (i < arrNum.length) {
            if (arrNum[i] == 0) {
                arrSort[i] = 1;
            } else {
                arrSort[i] = 0;
            }
            System.out.printf ("%d ", arrSort[i]); // Вывод в консоль измененного массива из 0 и 1
            i++;
        }

        /* Задача 2. Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21 */
        int [] arrEight = new int [SIZE02]; // Создаем новый массив размером 8
        System.out.printf("%n%nЗаполненный массив:%n");
        for (i = 0; i < arrEight.length; i++) {
            if (i !=0) arrEight[i] = arrEight[i-1]+3;
            System.out.printf("%d ", arrEight[i]);
        }

        /* Задача 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2 */
        i = 0;
        String strOut;

        int [] arrTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.printf("%n%nДо / После%n");
        while (i < arrTask3.length) {
            strOut = "";
            strOut = String.valueOf(arrTask3[i]) + " -> ";
            if (arrTask3[i] < 6) {
                arrTask3[i] = arrTask3[i] * 2;
            }
            strOut = strOut + String.valueOf(arrTask3[i]);
            System.out.println(strOut);
            i++;
        }

        /* Задача 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */
        int [][] arrSquare = getRandomSquare(SIZEA, SIZEB); // Получаем рамдомный 2-х массив SIZEA x SIZEB
        // Заполняем массив 1-цами по диагонали
        int shift = SIZEB, j = 0;

        System.out.printf("%n%nВыводим 2-х массив с <1> по диагонали%n");
        for (i = 0; i < SIZEA; i++) {
            for (j = 0; j < SIZEB; j++) {
                if (i == j || j == shift-1) {
                    arrSquare[i][j] = 1;
                    System.out.printf("%d ", arrSquare[i][j]);
                } else {
                    System.out.printf("%d ", arrSquare[i][j]);
                }
            }
            shift--;
            System.out.printf("%n");
        }

        /* Задача 5. Задать одномерный массив и найти в нем минимальный
        и максимальный элементы (без помощи интернета) */
        int order = 100;
        int [] arrTask = getRandomArr(SIZE01, order); // Получаем новый массив размером SIZE01
        printArray(arrTask);
        getArrayMax(arrTask); // Вызов метода получения максимума одномерного массива


    } // End Main

    // Вывод в строку элементов одномерного массива на печать (В консоль).
    private static void printArray(int[] arrPrn) {
        System.out.printf("%n");
        int i = 0;

        while (i < arrPrn.length) {
            System.out.printf("%d ", arrPrn[i]);
            i++;
        }
    }

    // Метод для формирования массива случайных чисел от 0 до 1
    private static int[] getRandomArr01(int size) {
        int [] arrRandom = new int [size];
        int i = 0;

        while (i < arrRandom.length) {
            arrRandom[i] = (int) (Math.random()*2);
            System.out.printf("%d ", arrRandom[i]); // Вывод в консоль рамдомного массива из 0 и 1
            i++;
        }
        return arrRandom;
    }

    // Метод для формирования двумерного массива заданной размерности
    private static int[][] getRandomSquare(int sizea, int sizeb) {
        int [][] arrRandomSQ = new int [sizea] [sizeb];
        int i = 0, j = 0;

        for (i = 0; i < sizea; i++) {
            for (j = 0; j < sizeb; j++) {
                arrRandomSQ[i][j] = (int) (Math.random()*100);
            //    System.out.printf("%d ", arrRandomSQ[i][j]);
            }
            //System.out.printf("%n");
        }
        return arrRandomSQ;
    }

    // Метод для получения рандомного одномерного массива целых чисел от 0 до Order
    private static int[] getRandomArr(int size01, int order) {
        int [] arrRand = new int [size01];
        int i = 0;

        while (i < arrRand.length) {
            arrRand[i] = (int) (Math.random()*order);
            //System.out.printf("%d ", arrRand[i]); // Вывод в консоль рамдомного массива из size01 элементов
            i++;
        }
        return arrRand;
    }

    // Метод для получения минимума в одномерном массиве
    private static void getArrayMax(int[] arrTask) {
        for (int i = arrTask.length-1; i > 0; i--) {
            System.out.printf("%d ", arrTask[i]);
        }
    }

    // Метод для получения максимума в одномерном массиве
}
