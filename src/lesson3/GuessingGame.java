package lesson3;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Создаем массив из базовых слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        String [][] totalChar; // Массив для получения и дальнейшей обработки символов
        String outWord = "###############"; // Забиваем шаблон вывода спецсимволами

        String hiddenWord = getRandomWord (words); // Получаем рандомом слово из нашего массива
        System.out.println(hiddenWord); // Загаданное рандомное слово
        System.out.printf("Система загадала английское слово, относящееся к категории Овощи / Фрукты%n");
        System.out.printf("Попробуйте угадать загаданное слово. Введите только строчными буквами:%n");
        Scanner scanner = new Scanner(System.in);

        /*Считываем введенное слово и отправляем на посимвольное
        сравнение с загаданным*/
        do {
            totalChar = getTotalChar(hiddenWord, scanner.nextLine());
            getOutWord(totalChar, outWord); // Выводим угаданные символы

            System.out.printf("%nХотите продолжить y/n ?%n");
        } while (!scanner.nextLine().equals("n"));
        scanner.close();

    } // End Main

    // Метод для вывода отгаданных символов в загаданном слове
    private static void getOutWord(String[][] totalChar, String outWord) {
        String str1 = "";
        int inx;
        StringBuilder new_s = new StringBuilder(outWord);

        for (int i = 0; i < totalChar.length-1; i++) {
            str1 = totalChar [i][0];
            if (str1 != null) {
                inx = Integer.parseInt(totalChar[i][1]);
                new_s.insert(inx, str1);
            }
        }
        System.out.println("Вы отгадали "+new_s);
    }

    // Метод для извлечения из массива слов, случайного
    private static String getRandomWord(String[] words) {
        Random random = new Random();
        int index = random.nextInt(words.length);

        return words[index];
    }

    // Метод для посимвольного сравнения загаданно и введенного пользователем слов
    private static String[][] getTotalChar(String hiddenWord, String nextLine) {
        int numCharIn = nextLine.length();  // Длина слова введенного пользователем
        int numCharHidden = hiddenWord.length(); // Длина загаданного слова

        // Объявляем двумерный массив для хранения найденных совпадений и их индексов
        String [][] twoChar = new String [numCharHidden][2]; // Длина первого измерения - по длине загаданного слова

        for (int i = 0; i < numCharHidden-1; i++) { // Цикл по символам загаданного слова
            String stri = Character.toString(hiddenWord.charAt(i));
            String strj;
            int j = 0;

            // Пока не пройдемся по всем символам загаданного слова
            while (j < numCharIn) {
                 strj = Character.toString(nextLine.charAt(j));

                 if (stri.equals(strj)) { // Пишем пару в массив [Совп.симв, Индекс]
                     twoChar [i][0] = strj;
                     twoChar [i][1] = Integer.toString(i);
                 }
                 j++;
            }
            if (twoChar[i][0] != null)
            System.out.println(" - "+twoChar [i][0] +" - "+twoChar [i][1]);
        }
        return twoChar;
    }
}
