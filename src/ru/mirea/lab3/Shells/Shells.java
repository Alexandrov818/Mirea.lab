package ru.mirea.lab3.Shells;

public class Shells {
    public static void main(String[] args) {
        //Создайте объекты класса Double, используя методы valueOf()
        Double abc = Double.valueOf(52.2);
        Double def = Double.valueOf(114.2);
        //Преобразовать значение типа String к типу double. Используем
        //метод Double.parseDouble().
        String strValue = "54.7";
        double parsedDouble = Double.parseDouble(strValue);
        //Преобразовать объект класса Double ко всем примитивным типам.
        double primitivedouble = abc.doubleValue();
        int primitiveint = abc.intValue();
        float primitivefloat = abc.floatValue();
        long primitivelong = abc.longValue();
        short primitiveshort = abc.shortValue();
        byte primitivebyte = abc.byteValue();
        //Вывести значение объекта Double на консоль
        System.out.println("Значение abc: " + abc);
        System.out.println("Значение def: " + def);
        //Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
        String d = Double.toString(3.14);
    }
}
