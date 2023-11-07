package com.poo.exhibitor.observer;

public class AdDisplay implements Observer {
    private String displayedAd;

    public AdDisplay() {
        displayedAd = "Nenhum anúncio disponível.";
    }

    @Override
    public void update(String newAd) {
        displayedAd = newAd;
    }

    public String getDisplayedAd() {
        return displayedAd;
    }
}