package ru.netology.Radio;

public class Radio {
    private int maxAmountWave = 10;
    private int currentWave;
    private int currentVolume;

    public Radio(int maxAmountWave) {
        this.maxAmountWave = maxAmountWave;
    }

    public Radio() {
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int setMaxAmountWave(int maxAmountWave) {
        this.maxAmountWave = maxAmountWave;
        return this.maxAmountWave;
    }

    public int getMaxAmountWave() {
        return maxAmountWave - 1;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxAmountWave - 1) {
            this.currentWave = 0;
            return;
        }
        if (currentWave < 0) {
            this.currentWave = getMaxAmountWave();
            return;
        }
        this.currentWave = currentWave;
    }

    public void nextWave() {
       setCurrentWave(currentWave + 1);
    }

    public void prevWave() {
        setCurrentWave(currentWave - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
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
