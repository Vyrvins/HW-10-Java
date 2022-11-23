package ru.nelology.cond;

public class Radio {

    private int minStation = 0;
    private int quantityStation = 10;
    private int maxStation = minStation + quantityStation;
    private int currentStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int quantityStation) {
        this.maxStation = minStation + quantityStation - 1;
        this.currentStation = minStation;
    }

    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.currentStation = minStation;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.currentVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}




