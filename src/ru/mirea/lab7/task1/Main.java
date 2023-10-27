package ru.mirea.lab7.task1;

import ru.mirea.lab4point1.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальные координаты");
        System.out.println("x: ");
        x = scanner.nextInt();
        System.out.println("y: ");
        y = scanner.nextInt();
        MovableRectangle rectangle = new MovableRectangle(x, y);

        System.out.println("Введите желаемое действие: \n");
        System.out.println("Если нужно переместить вниз, введите down: \n");
        System.out.println("Если нужно переместить вверх, введите up: \n");
        System.out.println("Если нужно переместить влево, введите left: \n");
        System.out.println("Если нужно переместить вправо, введите right: \n");
        System.out.println("Если нужно прекратить действия введите exit: \n");

        boolean exit = true;
        while(exit){
            String move = scanner.nextLine();
            switch (move){
                case ("down"):
                    rectangle.moveDown();
                    System.out.println(rectangle.toString());
                    break;
                case ("up"):
                    rectangle.moveUp();
                    System.out.println(rectangle.toString());
                    break;
                case ("left"):
                    rectangle.moveLeft();
                    System.out.println(rectangle.toString());
                    break;
                case ("right"):
                    rectangle.moveRight();
                    System.out.println(rectangle.toString());
                    break;
                case ("exit"):
                    System.out.println("Движения прекращены\n" + rectangle.toString());
                    exit = false;
                    break;
                default:
                    System.out.println("Убедитесь в правильности введенных данных");
                    break;
            }
        }
    }
}
