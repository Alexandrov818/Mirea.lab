package ru.mirea.lab9.task1;

public class Student implements Comparable<Student> {
    String name;
    int IDnumber;
    public Student(String name, int IDnumber) {
        this.name = name;
        this.IDnumber = IDnumber;
    }

    public String getName() {
        return name;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IDnumber=" + IDnumber +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Сравниваем студентов по их идентификатору
        return this.getIDnumber() - otherStudent.getIDnumber();
    }
}
