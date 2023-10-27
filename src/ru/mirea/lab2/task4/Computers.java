package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Computers {
    static Scanner scanner = new Scanner(System.in);

    static int NumberOfComputers = numComputers();
    static String[] computers = new String[NumberOfComputers];

    public static int numComputers(){
        int n;
        while (true){
            System.out.println("Введите кол-во добавляемых компьютеров: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n>0){
                    break;
                } else {
                    System.out.println("Число компьютеров не может быть меньше 0");}
            }
            else{
                System.out.println("Число компьютеров должно быть целым числом");
            }
        }
        return n;
    }

    public static String[] AddComp(){
        int i;
        for(i = 0; i < NumberOfComputers; i++) {
            System.out.println("Введите имя компьютера, который хотите добавить");
            computers[i] = scanner.nextLine();
        }
        return computers;
    }
}
