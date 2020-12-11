package com.sc;

import com.Rent_Object;

public class Hostel extends Simple_Construction implements Rent_Object {

    public Hostel(int number, String title){
        super(number, title);
    }

    @Override
    void repair() {
        System.out.println("Нам помогут студенты-строители на практике!");
    }

    public void rent() {
        System.out.println((int) (Math.random() * (999 + 1)));
    }
}
