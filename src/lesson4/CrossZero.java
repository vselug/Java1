package lesson4;
/* Крестики-нолики в процедурном стиле */


import java.util.Random;
import java.util.Scanner;

public class CrossZero {

    static final int SIZE = 3;            // Размерность игрового поля
    static final char DOT_EMPTY = '\u00b7';  // Символ пустой клетки 11034
    static final char DOT_HUMAN = 'X';    // Символ, которым ходит человек
    static final char DOT_AI = '0';       // Символ, которым ходит компьютер
    static final String HEADER_FIRST_EMPTY = "♥";
    static final String EMPTY = " ";

    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    static char [][] map = new char[SIZE][SIZE]; // Массив для игровых символов

    public static void main(String[] args) {

        turnGame();

    } // End Main

    // Запуск начала игры
    private static void turnGame() {
        initMap(); // Инициализация массива и заполнение пустыми спецсимволами
        printMap();
        playGame();
    }

    // Заполнение массива пустым спецсимволом
    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Основной метод печати
    private static void printMap() {
        printMapHeader(); // Заполнение и печать заголовка матрицы
        printMapRow(); // Печать строк матрицы
    }

    // Заполнение и печать заголовка
    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    // Выводим строки заполненные '.'
    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    // Печать строки матрицы
    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    // Основной метод запуска и обработки игры
    private static void playGame() {
       while (true) {
           // Ход человека
           humanTurn();
           // Печать поля ходя человека
           printMap();
           // Проверка возможности продолжения игры (проверка на победу человека)
           checkEnd(DOT_HUMAN);
           // Ход компьютера
           aiTurn ();
           // Печать поля ходя компьютера
           printMap();
           // Проверка возможности продолжения игры (проверка на победу компьютера)
           checkEnd(DOT_AI);

       }
    }

    // Метод обработки хода человека
    private static void humanTurn() {
        int rowNumber = 0;    // Номер в строке
        int columnNumber = 0; // Номер в столбце

        // Принимаем со сканера введенные числа
        System.out.println("\nХод человека. Введите номера строки и столбца!");
        do {
            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt();
            } else {
                in.next(); // Чтение следующего слова
                System.out.println("Введите число от 0 до "+SIZE+"\n");
                continue;
            }

            System.out.print("Столбец = ");
            if (in.hasNextInt()) {
               columnNumber = in.nextInt();
            } else {
                in.next(); // Чтение следующего слова
                System.out.println("Введите число от 0 до "+SIZE+"\n");
            }
        } while (!isCellValid (rowNumber, columnNumber));

        map [rowNumber - 1][columnNumber - 1] = DOT_HUMAN;

    }

    // Перегрузка метода isCellValid с дополнительным аргументом
    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, false);
    }

    // Проверка валидности введенных данных
    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAi) {

        // Ячейки не выходят за границу поля
        if (!isAi && (rowNumber < 1 || rowNumber > SIZE || columnNumber < 1 || columnNumber > SIZE)) {
            System.out.println("\nПроверьте значение строки и столбца!");
            return false;
        }

        // Пустота ячеек
        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAi) {
                System.out.println("\nВы выбрали занятую ячейку!");
            }
            return false;
        }
        return true;
    }

    // Метод проверки игрока на победу
    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        // Проверка на комбинацию
        if (checkWin(symbol)) {

        }

        // Ничья (например, сходили в последнюю ячейку)
        if (!isEnd && isMapFull()) {
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0); // Выход
        }
    }

    // Метод проверки выйгрышной комбинации
    private static boolean checkWin(char symbol) {


    }

    // Метод проверки заполненности карты
    private static boolean isMapFull() {

        return false;
    }

    // Метод обработки хода компьютера
    private static void aiTurn() {
        int rowNumber = 0;    // Номер в строке
        int columnNumber = 0; // Номер в столбце

        System.out.println("\nХод компьютера\n");

        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, columnNumber, true));

        map [rowNumber - 1][columnNumber - 1] = DOT_AI;
    }


}
