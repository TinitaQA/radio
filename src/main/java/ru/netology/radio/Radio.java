package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int numberOfRadioStation = 10; // количество радиостанций
    private int minRadioStation = 0; // минимальный номер радиостанции
    private int maxRadioStation = numberOfRadioStation - 1; // максимальный номер радиостанции
    private int currentRadioStation; // текущая радиостанция
    private int minVolume = 0; // минимальная громкость
    private int maxVolume = 100; // максимальная громкость
    private int currentVolume; // текущая громкость

    public Radio(int numberOfRadioStation) {
        this.maxRadioStation = numberOfRadioStation - 1;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {  // возможность выставить радиостаную
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void increaseVolume() { // увеличить громкость
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { // уменьшить громкость
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextRadioStation() { // переключение на следующую станцию
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() { // переключение на предыдущую станцию
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}


