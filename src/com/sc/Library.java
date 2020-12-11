package com.sc;

public class Library extends Simple_Construction {

    public Library(int number, String title) {
        super(number, title);
    }

    @Override
    void repair() {
        System.out.println("Аккуратней с книгами!");
    }

}
