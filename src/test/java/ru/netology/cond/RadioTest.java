package ru.netology.cond;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.nelology.cond.Radio;

public class RadioTest {

    @Test
    public void test() {
        Radio station = new Radio();
        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void test2() {
        Radio station = new Radio(12);
        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(11, station.getMaxStation());
        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void test3() {
        Radio volume = new Radio();
        Assertions.assertEquals(0, volume.getMinVolume());
        Assertions.assertEquals(100, volume.getMaxVolume());
        Assertions.assertEquals(0, volume.getCurrentVolume());
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

        volume.setCurrentVolume(101);
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
    public void shouldIncreaseVolumeAfterMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
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
    public void shouldDecreaseVolumeAfterMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.decreaseVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

