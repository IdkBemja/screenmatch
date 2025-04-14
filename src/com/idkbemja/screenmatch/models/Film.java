package com.idkbemja.screenmatch.models;

import com.idkbemja.screenmatch.calculate.Classification;

public class Film extends Title implements Classification {

    // Attributes
    private String director;

    public Film(String title, int year, int duration, boolean isInPlan, String Director) {
        setTitle(title);
        setYear(year);
        setDuration(duration);
        setInplan(isInPlan);
        setDirector(Director);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getClassification() {
        return (int) getResultCalc() / 2;
    }    
}
