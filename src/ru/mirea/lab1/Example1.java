package ru.mirea.lab1;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
    int sum=0, srednee;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число элементом массива:");
    int a = scanner.nextInt();
    int[] arr = new int[a];
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < a; i++){
        arr[i] = scanner.nextInt();
        sum += arr[i];
        }
    srednee = sum/a;
    System.out.println("Сумма элементов равна: " + sum);
    System.out.println("Среднее арифметическое равно: " + srednee);
    }
}