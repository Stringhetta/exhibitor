package com.poo.exhibitor.observer;

import java.util.ArrayList;
import java.util.List;

public class AdSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void createAd(String newAd) {

        notifyObservers(newAd);
    }

    private void notifyObservers(String newAd) {
        for (Observer observer : observers) {
            observer.update(newAd);
        }
    }
}