/*Создать класс точка Point, описывающий точку на плоскости.
Создать Circle класс, в котором одно поле представляет точку – центр
окружности, и добавить другие свойства, позволяющие задать точку на
плоскости. Создать третий класс Tester который использует для хранения
объектов массив объектов Circle и второе поле количество элементов в массиве.
Добавить в класс методы, позволяющие найти самую маленькую и самую
большую окружность. Добавить в класс метод, упорядочивающий хранение
окружностей в массив. Для инициализации полей радиуса и длины окружности
используйте класс Random или метод random() класса Math по желанию
*/


package ru.mirea.lab3.Math_Random.task2;

import java.util.Random;
import java.util.Scanner;

public class Tester {

    //хранит объекты массива Circle и количество элементов в массиве
    private static Circle[] circles;
    private static int size;
    static Scanner scanner = new Scanner(System.in);
    static int i;

    public static void main(String[] args) {
        Circle[] circles = initCirclesList();
        printCirclesList(circles);
        SmallerCircle();
        BiggerCircle();
    }
    public static Circle[] initCirclesList(){
        Random random = new Random();
        System.out.println("Введите количество кругов: ");
        size = scanner.nextInt();
        circles = new Circle[size];
        for (i = 0; i < size; i++){
            circles[i] = new Circle(new Point(random.nextDouble(), random.nextDouble()), random.nextDouble());
        }
        return circles;
    }

    public static Circle SmallerCircle() {
        Circle smallerCircle = null;
        for (i = 0; i < size; i++) {
            double radiusMin = 10000000;
            if (circles[i].getRadius() < radiusMin) {
                radiusMin = circles[i].getRadius();
                smallerCircle = circles[i];
            }
        }
        System.out.println("Наименьшая оркужность: " + smallerCircle);
        return smallerCircle;
    }

    public static Circle BiggerCircle() {
        Circle biggerCircle = null;
        for (i = 0; i < size; i++) {
            double radiusMax = 0;
            if (circles[i].getRadius() < radiusMax) {
                radiusMax = circles[i].getRadius();
                biggerCircle = circles[i];
            }
        }
        System.out.println("Наименьшая оркужность: " + biggerCircle);
        return biggerCircle;
    }
    public static void printCirclesList(Circle[] circles){
        for (Circle circle : circles){
            System.out.println(circle.toString());
        }
    }
}
