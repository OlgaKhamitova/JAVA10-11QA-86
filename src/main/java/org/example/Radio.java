package org.example;

public class Radio {
    private int currStationNo;
    private int currVolume;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrStationNo() {
        return currStationNo;
    }

    public int getCurrVolume() {
        return currVolume;
    }

    public void next() {
        if (currStationNo == maxStationNumber) {
            currStationNo = minStationNumber;
        } else {
            currStationNo = currStationNo + 1;
        }

    }

    public void prev() {
        if (currStationNo == minStationNumber) {
            currStationNo = maxStationNumber;
        } else {
            currStationNo = currStationNo - 1;
        }
    }

    public void increaseVolume() {
        if (currVolume < maxVolume) {
            currVolume = currVolume + 1;
        } else {
            currVolume = maxVolume;
        }
    }

    public void demotionVolume() {
        if (currVolume > minVolume) {
            currVolume = currVolume - 1;
        } else {
            currVolume = minVolume;
        }
    }
}
