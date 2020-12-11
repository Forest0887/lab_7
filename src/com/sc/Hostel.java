package com.sc;

import com.Rent_Object;

public class Hostel extends Simple_Construction implements Rent_Object {
    private int price;

    public Hostel(int number, String title){
        super(number, title);
    }

    @Override
    public void repair() {
        System.out.println("Нам помогут студенты-строители на практике!");
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String title() {
        return "Общежитие";
    }

    public void rent() {
        price = (int) (Math.random() * (999 + 1));
        System.out.println("Цена за Общежитие " + price);
    }

}
