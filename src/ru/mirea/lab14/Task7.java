package ru.mirea.lab14;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        scanner.close();
        if (isPasswordSecure(password)) {
            System.out.println("Пароль надежный.");
        } else {
            System.out.println("Пароль не надежный.");
        }
    }

    public static boolean isPasswordSecure(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            if (Character.isLowerCase(c)) hasLowercase = true;
            if (Character.isDigit(c)) hasDigit = true;

            if (hasUppercase && hasLowercase && hasDigit) break;
        }

        return hasUppercase && hasLowercase && hasDigit;
    }
}