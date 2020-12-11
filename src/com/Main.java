package com;

import com.oc.Concert_Hall;
import com.oc.Medical_Centr;
import com.oc.Olimpic_Stadium;
import com.sc.Hostel;
import com.sc.Library;

public class Main {
    public static void main(String[] args){
        University university = new University("SFU");

        Concert_Hall concert_hall = new Concert_Hall(523567, "Концерт Холл");
        Medical_Centr medical_centr = new Medical_Centr(285672, "Медицинский центр");
        Olimpic_Stadium olimpic_stadium = new Olimpic_Stadium(294728, "Олимпийский стадион");
        Hostel hostel = new Hostel(274614, "Общежитие");
        Library library = new Library(269370, "Библиотека");

        university.setUniversity_constructions(concert_hall);
        university.setUniversity_constructions(medical_centr);
        university.setUniversity_constructions(olimpic_stadium);
        university.setUniversity_constructions(hostel);
        university.setUniversity_constructions(library);

        Rental_Department<University_Construction> rental_department = new Rental_Department<>();
        rental_department.setFree_Object(concert_hall);
        rental_department.setFree_Object(hostel);
        rental_department.show_all();

        concert_hall.rent();
    }
}
