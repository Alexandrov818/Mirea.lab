package ru.mirea.lab23;

public class Main {
    public static void main(String[] args) {
    ArrayQueue myQueue = new ArrayQueue(5);

    myQueue.enqueue("Element 1");
    myQueue.enqueue("Element 2");
    myQueue.enqueue("Element 3");

    System.out.println("First element: " + myQueue.element());
    System.out.println("Queue size: " + myQueue.size());

    myQueue.dequeue();
    System.out.println("First element after one dequeue: " + myQueue.element());
    System.out.println("Queue size after one dequeue: " + myQueue.size());

    myQueue.clear();
    System.out.println("Queue size after clear: " + myQueue.size());
    System.out.println("Is queue empty: " + myQueue.isEmpty());
}
}
