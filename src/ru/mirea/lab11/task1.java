package ru.mirea.lab11;
import java.util.Date;
public class task1 {
    public static void main(String[] args) {
        String name = "Александров";
        Date taskReceiptDate = new Date();

        Date taskDueDate = new Date(taskReceiptDate.getTime() +  24 * 60 * 60 * 1000);

        System.out.println("Фамилия разработчика: " + name);
        System.out.println("Дата и время получения задания: " + taskReceiptDate);
        System.out.println("Дата и время сдачи задания: " + taskDueDate);
    }
}
