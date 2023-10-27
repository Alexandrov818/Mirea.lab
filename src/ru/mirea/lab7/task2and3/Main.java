package ru.mirea.lab7.task2and3;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 6);
        MovablePoint point2 = new MovablePoint(3, 3);
        MovableRectangle rectangle = new MovableRectangle(point1, point2);

        System.out.println(rectangle.toString());
        System.out.println("Переместим прямоугольник влево и наверх:");
        rectangle.moveLeft();
        rectangle.moveUp();

        System.out.println(rectangle.toString());
        System.out.println("Point1 speed test: " + point1.speedTest(point2));
    }
}
