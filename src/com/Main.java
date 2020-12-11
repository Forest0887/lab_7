package com;

import com.oc.Concert_Hall;
import com.oc.Medical_Centr;
import com.oc.Olimpic_Stadium;
import com.sc.Hostel;
import com.sc.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        University university = new University("SFU");

        Concert_Hall concert_hall = new Concert_Hall(523567, "Концерт Холл");
        Medical_Centr medical_centr = new Medical_Centr(285672, "Медицинский центр");
        Olimpic_Stadium olimpic_stadium = new Olimpic_Stadium(294728, "Олимпийский стадион");
        Hostel hostel = new Hostel(274614, "Общежитие");
        Library library = new Library(269370, "Библиотека");

        concert_hall.chek();
        library.repair();
        hostel.repair();
        olimpic_stadium.chek();
        medical_centr.chek();

        System.out.println();

        university.setUniversity_constructions(concert_hall);
        university.setUniversity_constructions(medical_centr);
        university.setUniversity_constructions(olimpic_stadium);
        university.setUniversity_constructions(hostel);
        university.setUniversity_constructions(library);

        Rental_Department<University_Construction> rental_department = new Rental_Department<>();

        rental_department.setFree_Object(concert_hall);
        rental_department.setFree_Object(hostel);
        rental_department.setLeased_Object(olimpic_stadium);

        rental_department.show_all2();

        System.out.println();

        olimpic_stadium.rent();
        concert_hall.rent();
        hostel.rent();

        System.out.println();

//        int money = 300;
//        System.out.println("Ищем свободный обект дешевле " + money);
//        ArrayList<University_Construction> buf = new ArrayList<>();
//        buf.add(rental_department.find_by_cost(money));
//        rental_department.delFree_Object(buf.get(0)); // ищем свободные объекты дешевле
//        // чем наша сумма и удаляем этот объект из числа свободных
//        rental_department.setLeased_Object(buf.get(0)); // добавляем в список арендованных
//        buf.clear();

        System.out.println();

//        rental_department.rent_from_free_object(1);

        rental_department.show_all2();
    }
}
