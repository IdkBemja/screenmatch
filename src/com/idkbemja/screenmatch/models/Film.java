package com.idkbemja.screenmatch.models;

import com.idkbemja.screenmatch.calculate.Classification;

public class Film extends Title implements Classification {

    // Attributes
    private String director;

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
