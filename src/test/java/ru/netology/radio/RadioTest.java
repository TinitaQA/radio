package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() { // прибавить громкость
        Radio fm = new Radio();

        fm.setCurrentVolume(1);
        fm.increaseVolume();

        int expected = 2;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // убавить громкость
        Radio fm = new Radio();

        fm.setCurrentVolume(99);
        fm.decreaseVolume();

        int expected = 98;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseWhenVolumeMax() { // прибавить, когда громкость максимум
        Radio fm = new Radio();

        fm.setCurrentVolume(100);
        fm.increaseVolume();

        int expected = 100;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseWhenVolumeMin() { // убавить, когда громкость минимум
        Radio fm = new Radio();

        fm.setCurrentVolume(0);
        fm.decreaseVolume();

        int expected = 0;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoiceRadioStation() { // установить радиостанцию
        Radio fm = new Radio();

        fm.setCurrentRadioStation(7);

        int expected = 7;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() { // cледующая станция
        Radio fm = new Radio();

        fm.setCurrentRadioStation(1);
        fm.nextRadioStation();

        int expected = 2;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() { // предыдущая станция
        Radio fm = new Radio();

        fm.setCurrentRadioStation(8);
        fm.prevRadioStation();

        int expected = 7;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioStationAfterMax() { // выбор станции больше максимума
        Radio fm = new Radio();

        fm.setCurrentRadioStation(10);

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choiceRadioStationBeforeMin() { // выбор станции меньше минимума
        Radio fm = new Radio();

        fm.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAfterMax() { // cледующая станция после максимума
        Radio fm = new Radio();

        fm.setCurrentRadioStation(9);
        fm.nextRadioStation();

        int expected = 0;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationAfterMax() { // cледующая станция после минимума
        Radio fm = new Radio();

        fm.setCurrentRadioStation(0);
        fm.prevRadioStation();

        int expected = 9;
        int actual = fm.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
