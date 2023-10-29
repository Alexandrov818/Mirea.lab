package ru.mirea.lab13.task1;
import java.util.Scanner;
public class PhoneParser {
        private String code, city, triplet, quadruple;

        public PhoneParser(String phone) {
            if (isValidPhoneNumber(phone)) {
                if (phone.startsWith("+7") || phone.startsWith("8")) {
                    code = "+7";
                } else {
                    code = phone.substring(0, 3);
                }
                city = phone.substring(phone.length() - 10, phone.length() - 7);
                triplet = phone.substring(phone.length() - 7, phone.length() - 4);
                quadruple = phone.substring(phone.length() - 4);
            } else {
                System.out.println("Неверное количество цифр или некорректный номер.");
                System.out.println("Проверьте правильность номера.");
            }
        }

        private boolean isValidPhoneNumber(String phone) {
            return phone.length() >= 10 && phone.length() <= 13;
        }

        @Override
        public String toString() {
            return code + city + "-" + triplet + "-" + quadruple;
        }

        public static void main(String[] args) {
            int numPhones;
            System.out.println("Сколько телефонных номеров вы хотите ввести?");
            Scanner scanner = new Scanner(System.in);
            numPhones = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numPhones; i++) {
                System.out.println("Введите номер телефона, который хотите ввести:");
                String phoneNumber = scanner.nextLine();
                PhoneParser parser = new PhoneParser(phoneNumber);
                System.out.println(parser);
            }
        }
    }
