package ru.mirea.lab2.task3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class Tester {
    static Scanner scanner = new Scanner(System.in);

    static int NumberOfCircles = numCircles();
    static Circle[] circles = new Circle[NumberOfCircles];
    static Random random = new Random();


    public static int numCircles(){
        int n;
        while (true){
            System.out.println("Введите размер массива: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n>0){
                    break;
                } else {
                    System.out.println("Число кругов не может быть меньше 0");}
            }
            else{
                System.out.println("Число кругов должно быть целым числом");
            }
        }
        return n;
    }

    public static double getRandomRoundedNum(Random random, int maxVal, int precision){
        double randomNumber = random.nextDouble(); // Генерировать случайное число между 0 и 1
        return Math.round(randomNumber * Math.pow(maxVal, precision)) / Math.pow(maxVal, precision);
    }


    public static void main(String[] args) {

        Point centr = new Point(1.0, 1.0);
        Circle circle = new Circle(centr, 1.0);

        for (int i = 0; i < NumberOfCircles; i++) {
            double x = getRandomRoundedNum(random, 10,3);  // Случайные координаты x (от 0 до 10)
            double y = getRandomRoundedNum(random, 10,3);   // Случайные координаты y (от 0 до 10)
            double radius = getRandomRoundedNum(random, 10,3);   // Случайный радиус (от 0 до 5)

            Point center = new Point(x, y);
            circles[i] = new Circle(center, radius);
        }
        for (int i = 0; i < NumberOfCircles; i++) {
            System.out.println(circles[i]);
        }
    }
}
