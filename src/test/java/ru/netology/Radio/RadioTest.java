package ru.netology.Radio;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {
@Test
    public void setWaveTest() {
    Radio radio = new Radio();
    radio.setCurrentWave(-9);
    int expected = 9;
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
    assertEquals(expected,actual);
}
    @Test
    void prevWaveTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        radio.prevWave();
        int expected = 4;
        int actual = radio.getCurrentWave();
        assertEquals(expected,actual);
    }
    @Test
    void SetWaveUpperLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(11);
        int expected = 0;
        int actual = radio.getCurrentWave();
        assertEquals(expected,actual);
    }
    @Test
    void SetWaveLowerLimitTest() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected,actual);
    }
    @Test
    public void setVolumeUpperlimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setVolumeLowerlimitTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void volumeUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeUp();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    void volumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeDown();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected,actual);
    }
}