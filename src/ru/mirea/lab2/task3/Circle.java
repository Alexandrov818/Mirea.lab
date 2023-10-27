package ru.mirea.lab2.task3;

public class Circle {
    public Point center;
    public double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double Area(double radius){
        return Math.PI * radius * radius;
    }

    public double СircumFerence(double radius){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
