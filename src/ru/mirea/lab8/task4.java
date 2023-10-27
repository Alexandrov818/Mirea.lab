package ru.mirea.lab8;
import java.util.Scanner;
/*
4. Задание Заданная сумма цифр
Даны натуральные числа k и s. Определите, сколько существует k-значных
натуральных чисел, сумма цифр которых равна s. Запись натурального числа не
может начинаться с цифры 0.
*/


public class task4 {
    public static int dividingNumber(int x, int y){
        int i;
        int sum = 0;
        int count = 0;
        for(i = (int)Math.pow(10, x - 1); i < Math.pow(10, x); i++){
            int number = i;
            int digit = i;
            while(number != 0){
                digit = number % 10;
                sum += digit;
                number /= 10;
            }
            if(sum == y){
                count++;
            }
            sum = 0;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество цифр из которых состоит ваше число: ");
        int k = scanner.nextInt();
        System.out.println("Введите сумму цифр: ");
        int s = scanner.nextInt();
        System.out.println(dividingNumber(k, s));
    }
}
