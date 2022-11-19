package ru.netology.cond;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.nelology.cond.Radio;

public class RadioTest {

    @Test
    public void shouldSetVolumeAboveMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAfterMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAfterMiddleRate() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAfterMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouDecreaseVolumeAfterMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAfterMiddleRate() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeAfterMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.decreaseVolume();
        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotValid10() {
        Radio station = new Radio();

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNotValidMinus1() {
        Radio station = new Radio();

        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMin() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAfterMax() {
        Radio station = new Radio();

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNextAfterMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.next();
        int expected = 1;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNextAfterMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoNextAfterMiddle() {
        Radio station = new Radio();
        station.setCurrentStation(4);
        station.next();
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPrevAfterMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPrevAfterMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.prev();
        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDoPrevAfterMiddle() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.prev();
        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}

