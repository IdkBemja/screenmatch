package com.idkbemja.screenmatch.calculate;

public class RecomendationFilters {

    public void Filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Highly recommended!");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Recommended!");
        } else {
            System.out.println("Watch it in other momment.");
        }
    }
}
