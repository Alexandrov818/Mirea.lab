package ru.mirea.lab7.task2and3;

public class MovablePoint implements Movable {
    public int x;
    public int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(){
        this.y += 1;
    }
    @Override
    public void moveDown(){
        this.y -= 1;
    }
    @Override
    public void moveLeft(){
        this.x -= 1;
    }
    @Override
    public void moveRight(){
        this.x += 1;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean speedTest(MovablePoint other) {
        return this.x == other.x && this.y == other.y;
    }
}
