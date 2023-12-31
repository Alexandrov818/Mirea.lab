package ru.mirea.lab2.task2;

public class Ball {
        double x = 0.0;
        double y = 0.0;

        public Ball(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX(){
            return this.x;
        }

        public double getY(){
            return this.y;
        }

        public void setX(double x){
            this.x = x;
        }

        public void setY(double y){
            this.y = y;
        }

        public void setXY(double x, double y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public void move(double xDisp, double yDisp){
            x += xDisp;
            y += yDisp;
        }
}
