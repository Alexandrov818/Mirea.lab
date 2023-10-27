package ru.mirea.lab7.task2and3;

import ru.mirea.lab7.task1.Movable;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    @Override
    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public boolean speedTest(MovableRectangle other){
        return this.topLeft.speedTest(other.topLeft) && this.bottomRight.speedTest(other.bottomRight);
    }
}
