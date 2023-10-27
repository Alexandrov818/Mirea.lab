/*Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку, далее определите и выведите на экран сообщение
о том, является ли массив строго возрастающей последовательностью.
*/
package ru.mirea.lab3.Math_Random.task3;

import java.util.Random;

public class task3 {
    private static int[] array;
    private static int i;

    public static int[] initArray(){
        Random random = new Random();
        int[] array = new int[4];
        System.out.println("Массив: ");
        for(i = 0; i < 4; i++){
            array[i] = random.nextInt(90)+10;
            System.out.println(array[i]);
        }
        return array;
    }


    public static void main(String[] args) {
        int count = 0;
        array = initArray();
        for(i = 0; i<=2; i++){
            if(array[i] < array[i+1]){
                count += 1;
            }
        }
        if (count == 3){
            System.out.println("Это массив возрастающих чисел");
        }
    }
}
