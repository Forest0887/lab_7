package com.oc;

import com.Rent_Object;

public class Concert_Hall extends Olimpic_Construction implements Rent_Object {
    public Concert_Hall(int number, String title) {
        super(number, title);
    }

    @Override
    public void chek() {
        System.out.println(super.getNumber());
    }

    public void rent() {
        System.out.println((int) (Math.random() * (999 + 1)));
    }
}
