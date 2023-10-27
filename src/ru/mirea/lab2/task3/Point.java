package ru.mirea.lab2.task3;

public class Point {
    double x = 0.0;
    double y = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
