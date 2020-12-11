package com;

abstract public class University_Construction { // объекты инфраструктуры
    private int number; // табельный номер
    private String title; // название

    public University_Construction(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}
