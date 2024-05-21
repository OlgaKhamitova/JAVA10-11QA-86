package org.example;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int stationCount) {
        this.maxStationNumber = stationCount - 1;
    }
    public Radio() {
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }

    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume || newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < minStationNumber || newCurrentStationNumber > maxStationNumber) {
            return;
        }

        currentStationNumber = newCurrentStationNumber;
    }
}
