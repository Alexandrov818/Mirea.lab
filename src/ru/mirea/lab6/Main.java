package ru.mirea.lab6;

public class Main {
    public static void main(String[] args) {
        Price price1 = new Price(14.8);
        Price price2 = new Price(54.7);
        System.out.println("Первая цена:");
        price1.getPrice();
        System.out.println("Вторая цена:");
        price2.getPrice();
    }
}
