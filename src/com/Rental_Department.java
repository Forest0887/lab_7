package com;

import java.util.ArrayList;

public class Rental_Department<T> {
    private ArrayList<T> free_Object = new ArrayList<>();
    private ArrayList<T> leased_Object = new ArrayList<>();

    public void setFree_Object(T t){
        if (t instanceof Rent_Object){
            free_Object.add(t);
        }
    }

    public void setLeased_Object(T t){
        if (t instanceof Rent_Object) {
            leased_Object.add(t);
        }
    }

    public void delFree_Object(T t){
        if (t instanceof Rent_Object) {
            free_Object.remove(t);
        }
    }

    public void delLeased_Object(T t){
        if (t instanceof Rent_Object) {
            leased_Object.remove(t);
        }
    }

    public void show_all(){ // only for debag
        for (T t: free_Object){
            System.out.println(t);
        }
        for (T t: leased_Object){
            System.out.println(t);
        }
    }


//    public T find_by_cost(int money){}
//    По условию метод - rent возвращает тип void и выводит рандомную цену на экран
//    Тогда как можно сделать поиск подходящих по цене объектов, если цена нигде не зафиксирована?

//    Про метод rentFromFreeObject ничего не сказано в тексте задачи
}
