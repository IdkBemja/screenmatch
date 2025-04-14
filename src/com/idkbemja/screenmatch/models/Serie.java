package com.idkbemja.screenmatch.models;

public class Serie extends Title {

    private int seasons;
    private int episodesperseason;
    private int minutesperepisode;

    public Serie(String title, int year, int duration, boolean isInPlan, int seasons, int episodesperseason, int minutesperepisode) {
        setTitle(title);
        setYear(year);
        setDuration(duration);
        setInplan(isInPlan);
        this.seasons = seasons;
        this.episodesperseason = episodesperseason;
        this.minutesperepisode = minutesperepisode;
    }
    // Setters 
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public void setEpisodesperseason(int episodesperseason) {
        this.episodesperseason = episodesperseason;
    }
    public void setMinutesperepisode(int minutesperepisode) {
        this.minutesperepisode = minutesperepisode;
    }
    // Getters

    @Override
    public int getDuration() {
        return seasons * episodesperseason * minutesperepisode;
    }

    public int getSeasons() {
        return seasons;
    }
    public int getEpisodesperseason() {
        return episodesperseason;
    }
    public int getMinutesperepisode() {
        return minutesperepisode;
    }

}
