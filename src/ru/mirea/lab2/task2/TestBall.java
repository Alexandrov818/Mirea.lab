package ru.mirea.lab2.task2;

import ru.mirea.lab2.task1.Author;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 1.0);
        System.out.println("Author = " + ball.toString());
        ball.move(2.0, 2.0);
        System.out.println(ball.toString());
        System.out.println(ball.getX());
        ball.setY(5.0);
        System.out.println(ball.getX());
        System.out.println(ball.getY());
    }
}
