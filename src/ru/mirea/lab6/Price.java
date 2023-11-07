package ru.mirea.lab6;

public class Price implements Priceable{
    Double price;

    public Price(Double price) {
        this.price = price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println(price);
    }
}