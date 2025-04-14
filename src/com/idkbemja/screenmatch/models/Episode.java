package com.idkbemja.screenmatch.models;

import com.idkbemja.screenmatch.calculate.Classification;

public class Episode extends Serie implements Classification {

    public Episode(String title, int year, int duration, boolean isInPlan, int seasons, int episodesperseason,
            int minutesperepisode) {
        super(title, year, duration, isInPlan, seasons, episodesperseason, minutesperepisode);
    }

    private int number;
    private String name;
    private Serie serie;

    private int totalViews;

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


    // Getters
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Serie getSerie() {
        return serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }

}
