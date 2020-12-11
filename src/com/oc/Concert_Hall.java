package com.oc;

import com.Rent_Object;

public class Concert_Hall extends Olimpic_Construction implements Rent_Object {
    private int price;

    public Concert_Hall(int number, String title) {
        super(number, title);
    }

    @Override
    public void chek() {
        System.out.println(super.getNumber());
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String title() {
        return "Конерт холл";
    }

    public void rent() {
        price = (int) (Math.random() * (999 + 1));
        System.out.println("Цена за Концерт Холл " + price);
    }



}
