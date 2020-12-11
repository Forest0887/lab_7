package com.oc;

public class Medical_Centr extends Olimpic_Construction {

    public Medical_Centr(int number, String title) {
        super(number, title);
    }

    @Override
    public void chek() {
        System.out.println(super.getTitle());
    }
}
