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

//    public void show_all(){ // only for debag
//        for (T t: free_Object){
//            System.out.println(t);
//        }
//        for (T t: leased_Object){
//            System.out.println(t);
//        }
//    }

    public void show_all2(){
        int s = 0;
        for (T t: free_Object){
            s++;
            if (t instanceof Rent_Object){
                System.out.println("Свобоные объекты: " + s + " " + ((Rent_Object) t).title());
            }
        }
        s = 0;
        for (T t: leased_Object){
            s++;
            if (t instanceof Rent_Object){
                System.out.println("Ареднованные объекты: " + ((Rent_Object) t).title());
            }
        }
    }

    public T find_by_cost(int money){
        for (T t: free_Object){
            if (t instanceof Rent_Object){
                if (((Rent_Object) t).price() < money){
                    return t;
                }
            }
        }
        return null;
    }

    public void rent_from_free_object(int index){
        if (index <= free_Object.size() && index > 0){
            leased_Object.add(free_Object.get(index - 1));
            free_Object.remove(index - 1);
        } else {
            System.out.println("Объекта с таким индексом нет");
        }
    }
}
