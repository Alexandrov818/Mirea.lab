package ru.mirea.lab3.Math_Random.task2;

public class Circle {
    Point centr;
    double radius;

    public Circle(Point centr, double radius) {
        this.centr = centr;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centr=" + centr +
                ", radius=" + radius +
                '}';
    }
}
