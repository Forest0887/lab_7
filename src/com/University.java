package com;

import java.util.ArrayList;

public class University {
    private String title;
    private ArrayList<University_Construction> university_constructions = new ArrayList<>();

    public University(String title) {
        this.title = title;
    }

    public void setUniversity_constructions(University_Construction university_constructions) {
        this.university_constructions.add(university_constructions);
    }

}
