package ru.mirea.lab14;
import java.util.Scanner;
public class Task6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите e-mail адрес: ");
            String email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("Введенный e-mail адрес корректен.");
            } else {
                System.out.println("Введенный e-mail адрес некорректен.");
            }
        }

        public static boolean isValidEmail(String email) {
            if (email == null || email.isEmpty()) {
                return false;
            }

            int atSignIndex = email.indexOf('@');
            if (atSignIndex <= 0 || atSignIndex == email.length() - 1) {
                return false;
            }

            int dotIndex = email.lastIndexOf('.');
            if (dotIndex <= atSignIndex || dotIndex == email.length() - 1) {
                return false;
            }

            return true;
        }
    }
