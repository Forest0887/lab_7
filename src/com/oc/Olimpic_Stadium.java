package com.oc;

import com.Rent_Object;

public class Olimpic_Stadium extends Olimpic_Construction implements Rent_Object {
    public Olimpic_Stadium(int number, String title) {
        super(number, title);
    }

    @Override
    public void chek() {
        System.out.println(super.getNumber() + " " + super.getTitle());
    }

    public void rent() {
        System.out.println((int) (Math.random() * (999 + 1)));
    }
}
