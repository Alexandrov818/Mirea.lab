package ru.mirea.taskList2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(3);
        list.append(1);
        list.append(4);
        list.append(2);
        list.append(5);

        System.out.println("Исходный список:");
        list.printList();

        list.sortList();

        System.out.println("Отсортированный список:");
        list.printList();
    }
}
