package ru.mirea.lab4;

public enum Seasons{
    Winter(-10),
    Spring(10),
    Summer(25),
    Autumn(10);

    private int  temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public static void printSeasonDescription(Seasons season) {
        switch (season) {
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public String getDescription() {
        // Для Лета возвращаем "Теплое время года", для остальных "Холодное время года"
        if (this == Summer) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}
