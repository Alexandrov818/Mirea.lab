package ru.mirea.lab4point1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 3.5);
        System.out.println(circle.toString());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("---------------");

        Square square = new Square("Yellow", true, 5.4);
        System.out.println(square.toString());
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println("---------------");

        Rectangle rectangle = new Rectangle("Pink", false, 5.4, 6);
        System.out.println(rectangle.toString());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
    }
}
