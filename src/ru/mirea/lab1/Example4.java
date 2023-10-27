package ru.mirea.lab1;

public class Example4 {
    public static void main(String[] args){
        double x;
        for(int i = 1; i <= 10; i++){
            x = (double) 1 / i;
            String formatted = String.format("%.2f", x);
            System.out.println(formatted);
        }
    }
}