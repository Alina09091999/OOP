package ru.netology.radio.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0RadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMinusRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastRadioStation() {
        Radio radio = new Radio();
        radio.setToLastRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrev0RadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prevRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext9RadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.nextRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncrease100RadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(100);

        radio.increaseRadioVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(57);

        radio.increaseRadioVolume();

        int expected = 58;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecrease0RadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(0);

        radio.decreaseRadioVolume();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(78);

        radio.decreaseRadioVolume();

        int expected = 77;
        int actual = radio.getCurrentRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToAnotherRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}
