package ru.netology.radio;

public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setToLastRadioStation() {
        currentRadioStation = 9;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }


    public int currentRadioVolume;

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









