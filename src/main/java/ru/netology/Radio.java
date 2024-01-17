package ru.netology;

public class Radio {
    private int currentStation; // номер текущей радиостанции
    private int currentVolume; // уровень громкости звука
    public Radio() {
        this.currentStation = 0; // начинаем с первой станции
        this.currentVolume = 50; // начальная громкость 50
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setStation(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            currentStation = stationNumber;
        } else {
            System.out.println("Недопустимый номер станции");
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setVolume(int volumeLevel) {
        if (volumeLevel >= 0 && volumeLevel <= 100) {
            currentVolume = volumeLevel;
        } else {
            System.out.println("Недопустимый уровень громкости");
        }
    }
}
