package ru.mirea.lab8;
import java.util.Scanner;
/*
3. Задание от A до B
Даны два целых числа A и В (каждое в отдельной строке). Выведите все
числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
убывания в противном случае
*/
public class task3 {
    public static int[] sequanse(int x, int y){
        int i;
        int[] seq = new int[0];
        if (x < y){
            seq = new int[y - x + 1];
            for(i = 0; i <= y - x; i++){
                seq[i] = i + x;
            }
        }
        if (x > y){
            seq = new int[x - y + 1];
            for(i = 0; i <= x - y; i++){
                seq[i] = x - i;
            }
        }
        if (x == y){
            System.out.println("Числа должны различаться!");
        }
        return seq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int[] result = sequanse(a, b);
        System.out.print("Итоговая последовательность: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", "); // Добавляем запятую между элементами
            }
        }
    }
}
