package ru.mirea.lab1;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, факториал которого необходимо вычислить:");
        int a = scanner.nextInt();
        int result = factorial(a);
        System.out.println("Факториал числа " + a + " равен " + result);
    }


    public static int factorial(int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }
}
