package ru.mirea.taskList2;

public class LinkedList {
    class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    Node head;

    public LinkedList() {
        head = null;
    }

    // Метод для добавления элемента в конец списка
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    // Метод для сортировки списка
    public void sortList() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null; // отсортированный список

        while (head != null) {
            Node minNode = findMinNode();
            if (minNode != null) {
                if (minNode.prev != null) {
                    minNode.prev.next = minNode.next;
                } else {
                    head = minNode.next;
                }

                if (minNode.next != null) {
                    minNode.next.prev = minNode.prev;
                }

                minNode.next = sorted;
                minNode.prev = null;
                if (sorted != null) {
                    sorted.prev = minNode;
                }
                sorted = minNode;
            }
        }

        head = sorted;
    }

    // Метод для поиска узла с минимальным значением
    private Node findMinNode() {
        if (head == null) {
            return null;
        }

        Node minNode = head;
        Node current = head.next;

        while (current != null) {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        }

        return minNode;
    }

    // Метод для вывода списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}