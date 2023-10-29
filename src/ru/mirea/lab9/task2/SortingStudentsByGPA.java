package ru.mirea.lab9.task2;
import java.util.List;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(), o1.getGpa()); // Сравнение для убывания
    }

    public void quickSort(List<Student> students, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(students, left, right);
            quickSort(students, left, pivotIndex - 1); // Сортировка левой части
            quickSort(students, pivotIndex + 1, right); // Сортировка правой части
        }
    }

    public int partition(List<Student> students, int left, int right) {
        Student pivot = students.get(right); // Опорный элемент
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (compare(students.get(j), pivot) > 0) { // Сравнение для убывания
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, right);
        return i + 1;
    }

    public void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }
}