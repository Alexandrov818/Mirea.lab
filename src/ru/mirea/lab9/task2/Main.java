package ru.mirea.lab9.task2;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Masha", 240));
        students.add(new Student("Gena", 198));
        students.add(new Student("Lesha", 204));
        students.add(new Student("Gosha", 154));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}