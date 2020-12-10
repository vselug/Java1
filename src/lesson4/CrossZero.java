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

        initMap(); // Инициализация массива и заполнение пустыми спецсимволами

        // Заполняем заголовок
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();

        // Выводим строки заполненные '.'
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }


    }

    // Заполнение массива пустым спецсимволом
    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

}
