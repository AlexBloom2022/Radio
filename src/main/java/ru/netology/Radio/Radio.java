package ru.netology.Radio;

public class Radio {
    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave > 9) {
            newCurrentWave = 0;
        }
        if (newCurrentWave < 0) {
            newCurrentWave = 9;
        }
        currentWave = newCurrentWave;
    }

    public void nextWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        }
    }
    public void prevWave() {
        if (currentWave < 9) {
            currentWave = currentWave - 1;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void volumeUp() {
        setCurrentVolume(currentVolume + 1);
    }
    public void volumeDown() {
        setCurrentVolume(currentVolume - 1);
        }
    }
