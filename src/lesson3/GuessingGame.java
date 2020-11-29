package lesson3;

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

        String hiddenWord = getRandomWord (words); // Получаем рандомом слово из нашего массива
        System.out.println(hiddenWord); // Загаданное рандомное слово
        System.out.printf("Система загадала английское слово, относящееся к категории Овощи / Фрукты%n");
        System.out.printf("Попробуйте угадать загаданное слово. Введите только строчными буквами:%n");
        Scanner scanner = new Scanner(System.in);

        /*Считываем введенное слово и отправляем на посимвольное
        сравнение с загаданным*/
        totalChar = getTotalChar(hiddenWord, scanner.nextLine());

        // !!!! Не забыть вставить проверку на тупое сравнение! Вдруг юзер угадал сразу!

        scanner.close();

    } // End Main

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
        String [][] twoChar = new String [numCharIn][2]; // Длина первого измерения - по длине введенного слова

        for (int i = 0; i < numCharHidden; i++) { // Цикл по символам загадонного слова
            String stri = "#";
            String str1, str2;
            char c1, c2;
            int j = 0;

            if (twoChar.length <= numCharIn) { // Пока длина собранного массива не больше введенного слова
                while (j < nextLine.length()) {
                    str1 = Character.toString(nextLine.charAt(i));
                    str2 = Integer.toString(j);
                    System.out.println(str1);
                    System.out.println(str2);
                    j++;
                }
            }


            /*for (int j = 0; j < numCharIn; j++) {
                String strj = "#";
                c1 = nextLine.charAt(j);
                c2 = hiddenWord.charAt(i);
                if (nextLine.charAt(j) == hiddenWord.charAt(i)) {
                    twoChar [i][i] = Character.toString(nextLine.charAt(i));
                    str1 = Character.toString(nextLine.charAt(i));
                    twoChar [i][1] = Integer.toString(j);

                    str2 = Integer.toString(j);
                    System.out.println(" - "+twoChar [i][i] +" - "+twoChar [i][1]);
                    break;
                }
                *//*else {
                    twoChar [i][i] = strj;
                    twoChar [i][1] = strj;
                    System.out.println(" - "+twoChar [i][i] +" - "+twoChar [i][1]);
                }*//*
            }*/
        }

        return twoChar;
    }

}
