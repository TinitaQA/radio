package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio fm = new Radio(30);

    @Test
    public void shouldIncreaseVolume() { // прибавить громкость

        fm.setCurrentVolume(1);
        fm.increaseVolume();

        int expected = 2;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // убавить громкость

        fm.setCurrentVolume(99);
        fm.decreaseVolume();

        int expected = 98;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseWhenVolumeMax() { // прибавить, когда громкость максимум

        fm.setCurrentVolume(100);
        fm.increaseVolume();

        int expected = 100;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseWhenVolumeMin() { // убавить, когда громкость минимум

        fm.setCurrentVolume(0);
        fm.decreaseVolume();

        int expected = 0;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoiceRadioStation() { // установить радиостанцию

        fm.setCurrentRadioStation(7);

        int expected = 7;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() { // cледующая станция

        fm.setCurrentRadioStation(1);
        fm.nextRadioStation();

        int expected = 2;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() { // предыдущая станция

        fm.setCurrentRadioStation(8);
        fm.prevRadioStation();

        int expected = 7;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioStationAfterMax() { // выбор станции больше максимума

        fm.setCurrentRadioStation(30);

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioStationBeforeMin() { // выбор станции меньше минимума

        fm.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAfterMax() { // cледующая станция после максимума

        fm.setCurrentRadioStation(29);
        fm.nextRadioStation();

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationAfterMax() { // cледующая станция после минимума

        fm.setCurrentRadioStation(0);
        fm.prevRadioStation();

        int expected = 29;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationDefault() { // cледующая станция по умолчанию
        Radio fm = new Radio();

        fm.setCurrentRadioStation(9);
        fm.nextRadioStation();

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationDefault() { // предыдущая станция по умолчанию
        Radio fm = new Radio();

        fm.setCurrentRadioStation(0);
        fm.prevRadioStation();

        int expected = 9;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
