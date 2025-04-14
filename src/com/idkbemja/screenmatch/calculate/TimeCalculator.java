package com.idkbemja.screenmatch.calculate;

import com.idkbemja.screenmatch.models.Title;

public class TimeCalculator {

    private int TotalTime;

    public void include(Title title) {
        this.TotalTime += title.getDuration();
    }

    public int getTotalTime() {
        return TotalTime;
    }

}
