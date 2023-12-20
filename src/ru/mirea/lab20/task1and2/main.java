package ru.mirea.lab20.task1and2;

public class main {
    public static void main(String[] args) {
        Class<Integer, String, Double> object = new Class<>(35, "Hello", 10.5);

        System.out.println("First: " + object.getFirst());
        System.out.println("Second: " + object.getSecond());
        System.out.println("Third: " + object.getThird());

        System.out.println(object.toString());

        object.displayTypes();
    }
}