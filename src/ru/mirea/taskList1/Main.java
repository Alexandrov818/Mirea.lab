package ru.mirea.taskList1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gena", 18);
        Student student2 = new Student("Lesha", 20);
        Student student3 = new Student("Vitya", 21);
        LinkedList list = new LinkedList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list.toString());
        list.remove();
        System.out.println(list.toString());
        System.out.println(list.output(0));
    }
}
