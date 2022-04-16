package ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void initMaxWaveAmount() {
        Radio radio1 = new Radio(8);
        assertEquals(7, radio1.getMaxAmountWave());
    }

    @Test
    public void initMaxWaveAmountNoArgsTest() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxAmountWave());
    }

    @Test
    public void getCurrentWaveUnderLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int expected = radio.getMaxAmountWave();

        int actual = radio.getCurrentWave();
        assertEquals(expected,actual);
    }

    @Test
    public void getCurrentWaveUnderLimitWithInitArgTest(){
        Radio radio1 = new Radio(90);
        radio1.setCurrentWave(-1);
        int expected = radio1.getMaxAmountWave();

        int actual = radio1.getCurrentWave();
        assertEquals(expected,actual);
    }

    @Test
    public void setWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void setWaveUpLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void setWaveLowLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        int expected = 0;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void setWaveUnderLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);
        int expected = 6;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void nextWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        radio.nextWave();
        int expected = 6;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void nextWaveUpperLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.nextWave();
        int expected = 0;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prevWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prevWave();
        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prevWaveUpperLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.prevWave();
        int expected = 8;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void SetWaveUpperLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(11);
        int expected = 0;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void SetWaveLowerLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeUpperlimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLowerlimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void volumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeDown();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}