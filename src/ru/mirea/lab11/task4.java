package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод года, месяца и числа
        System.out.print("Введите год (например, 2023): ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // Месяцы в Calendar начинаются с 0
        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        // Ввод часов и минут
        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // Создание объекта Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateStr = year + "-" + (month + 1) + "-" + day + " " + hours + ":" + minutes;
        Date date = null;

        try {
            date = dateFormat.parse(dateStr);
        } catch (java.text.ParseException e) {
            System.out.println("Ошибка в формате даты или времени. Пожалуйста, введите данные в корректном формате.");
            return;
        }

        System.out.println("Объект Date: " + date);

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
