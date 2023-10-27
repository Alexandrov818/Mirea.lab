package ru.mirea.lab1;
import java.util.Scanner;
public class Example2 {
        public static void main(String[] args) {
            int sum = 0, srednee, i = 0, min = 1000000, max = -1000000;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число элементом массива:");
            int a = scanner.nextInt();
            int[] arr = new int[a];
            System.out.println("Введите элементы массива:");
            for (i = 0; i < a; i++) {
                arr[i] = scanner.nextInt();
            }
            i = 0;
            do{
                sum += arr[i];
                i++;
            } while(i < a);
            System.out.println("Сумма элементов массива равна:" + sum);
            for (i = 0; i < a; i++) {
                if (arr[i]<min){
                    min = arr[i];
                }
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("Максимальный элемент массива:" + max);
            System.out.println("Минимальный элемент массива:" + min);
        }
    }