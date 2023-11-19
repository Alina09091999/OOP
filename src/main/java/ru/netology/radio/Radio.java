package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;
    private int maxRadioStation;

    public Radio() {

        this.maxRadioStation = 9;
    }

    public Radio(int stationsCount) {

        this.maxRadioStation = stationsCount - 1;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setToLastRadioStation() {

        currentRadioStation = maxRadioStation;
    }

    public void setCurrentRadioStation(int stationsCount) {
        if (stationsCount < 0) {
            return;
        }
        if (stationsCount > maxRadioStation) {
            return;
        }
        this.currentRadioStation = stationsCount;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {

        currentRadioVolume = newCurrentRadioVolume;
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < 100) {
            currentRadioVolume = currentRadioVolume + 1;
        } else {
            currentRadioVolume = 100;
        }
    }

    public void decreaseRadioVolume() {
        if (currentRadioVolume == 0) {
            currentRadioVolume = 0;
        } else {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }
}









