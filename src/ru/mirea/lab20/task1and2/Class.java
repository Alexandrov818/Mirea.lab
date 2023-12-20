package ru.mirea.lab20.task1and2;

public class Class<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Class(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void displayTypes() {
        System.out.println("Type of First: " + first.getClass().getName());
        System.out.println("Type of Second: " + second.getClass().getName());
        System.out.println("Type of Third: " + third.getClass().getName());
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
