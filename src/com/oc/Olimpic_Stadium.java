package com.oc;

import com.Rent_Object;

public class Olimpic_Stadium extends Olimpic_Construction implements Rent_Object {
    private int price;
    public Olimpic_Stadium(int number, String title) {
        super(number, title);
    }

    @Override
    public void chek() {
        System.out.println(super.getNumber() + " " + super.getTitle());
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String title() {
        return "Олимпийский стадион";
    }

    public void rent() {
        price = (int) (Math.random() * (999 + 1));
        System.out.println("Цена за Олимпийский стадион " + price);
    }

}
