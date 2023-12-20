package ru.mirea.lab23;

public class ArrayQueue {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
    }

    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[elements.length];
        size = head = tail = 0;
    }
}
