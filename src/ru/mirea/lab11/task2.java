package ru.mirea.lab11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
            // Получение текущей даты
        Date currentDate = new Date();

            // Создание объекта SimpleDateFormat для форматирования даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Ввод даты пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД (например, 2023-10-29): ");
        String userDateInput = scanner.nextLine();

        Date userDate = null;

            // Попытка парсинга даты, введенной пользователем
        try {
            userDate = dateFormat.parse(userDateInput);
        } catch (java.text.ParseException e) {
            System.out.println("Ошибка в формате даты. Введите дату в формате ГГГГ-ММ-ДД.");
            return;
        }

            // Сравнение текущей даты с датой пользователя
        if (currentDate.before(userDate)) {
            System.out.println("Введенная дата находится в будущем.");
        } else if (currentDate.after(userDate)) {
            System.out.println("Введенная дата находится в прошлом.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}