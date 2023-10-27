package ru.mirea.lab3.Math_Random.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int ArrSize = scanner.nextInt();
        Double[] Arr = new Double[ArrSize];
        Double[] Arr2 = new Double[ArrSize];

        System.out.println("Массив рандомно заполненный числами методом Random:");
        for(int i = 0; i < ArrSize; i++){
            Arr[i] = random.nextDouble();
            System.out.println(Arr[i]);
        }

        System.out.println("Массив рандомно заполненный числами методом Math:");
        for(int i = 0; i < ArrSize; i++){
            Arr2[i] = Math.random();
            System.out.println(Arr2[i]);
        }

        Arrays.sort(Arr);
        Arrays.sort(Arr2);
        System.out.println("отсортированный массив Random: ");
        for(int i = 0; i < ArrSize; i++){
            System.out.println(Arr[i]);
        }
        System.out.println("отсортированный массив Math: ");
        for(int i = 0; i < ArrSize; i++) {
            System.out.println(Arr2[i]);
        }
    }
}
