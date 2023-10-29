package ru.mirea.lab14;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        if (text.matches(".*\\d(?![+]).*")) {
            System.out.println("В тексте есть цифры, за которыми не стоит знак '+'");
        } else {
            System.out.println("В тексте нет цифр без знака '+'");
        }
    }
}