package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        int wordCount = CountWords(text);

        System.out.println("Количество введенных вами слов: " + wordCount);
    }

        public static int CountWords(String str){
            String[] words = str.split(" ");
            return words.length;
        }
}
