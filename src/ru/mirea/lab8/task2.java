package ru.mirea.lab8;
import java.util.Scanner;
/*
2. Задание от 1 до n
Дано натуральное число n. Выведите все числа от 1 до n.
 */
public class task2 {
    public static int[] sequence(int n){
        int[] seq = new int[n];

        for (int i = 0; i < n; i++){
            seq[i] = i + 1;
        }
        return seq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число, до которого необходимо вывесли число: ");
        int x = scanner.nextInt();
        int[] result = sequence(x);
        System.out.print("Итоговая последовательность: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", "); // Добавляем запятую между элементами
            }
        }
    }
}
