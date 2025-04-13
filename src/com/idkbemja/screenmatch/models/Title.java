package com.idkbemja.screenmatch.models;

public class Title {

    private String title;
    private int year;
    private int duration; // in minutes
    private boolean inplan;

    private double resultCalc; // result of the calculation of the note
    private int count = 0; // number of notes

    public int getCount(){
        return count;
    }

    // Constructor
    public void showTecnicalData() {
        System.out.println("The film is " + title + " from " + year + 
        " with a duration of " + getDuration() + " minutes. Is incluide in the plan: " + inplan);
    }

    public void calification(double note) {
        resultCalc += note;
        count++;
    }

    public double getResultCalc() {
        return resultCalc / count;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setInplan(boolean inplan) {
        this.inplan = inplan;
    }


    // Getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public boolean getInplan() {
        return inplan;
    }

}
