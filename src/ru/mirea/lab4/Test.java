package ru.mirea.lab4;

public class Test {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.Summer;
        System.out.println("Время года " + myFavoriteSeason);
        System.out.println("Средняя температура " + myFavoriteSeason.getTemperature());
        System.out.println("Описание времени года " + myFavoriteSeason.getDescription());
        System.out.println("--------------------------------------------------");

        Seasons.printSeasonDescription(myFavoriteSeason);
        for(Seasons seasons : Seasons.values()){
            System.out.println("\nВремя года " + myFavoriteSeason);
            System.out.println("\nСредняя температура " + myFavoriteSeason.getTemperature());
            System.out.println("\nОписание времени года " + myFavoriteSeason.getDescription());
            System.out.println("--------------------------------------------------");
        }
    }
}
