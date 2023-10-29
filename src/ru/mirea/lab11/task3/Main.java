package ru.mirea.lab11.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date(100, 0, 15); // Пример: 15 января 2000 года
        Student student = new Student("Иванов", birthDate);
        // Выводим информацию о студенте, включая дату рождения в разных форматах
        System.out.println("Стандартный формат: " + student.getFormattedBirthDate("dd.MM.yyyy"));
        System.out.println("Средний формат: " + student.getFormattedBirthDate("dd MMM yyyy"));
        System.out.println("Полный формат: " + student.getFormattedBirthDate("dd MMMM yyyy"));
        System.out.println(student);
    }
}
