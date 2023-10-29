package ru.mirea.lab9.task1;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Vova", 133),
                new Student("Masha", 130),
                new Student("Gena", 132),
                new Student("Lev", 131)
        };
        System.out.println("Начальный массив");
        showStudent(students);
        sorting(students);
        System.out.println("Отсортированный массив");
        showStudent(students);
    }

    public static void showStudent(Student[] students){
        for(Student student : students){
            System.out.println(student);
        }
    }

    public static Student[] sorting(Student[] students){
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
        return students;
    }
}
