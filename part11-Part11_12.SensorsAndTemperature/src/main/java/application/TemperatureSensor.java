package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean power;
    public TemperatureSensor() {
        power = false;
    }

    @Override
    public boolean isOn() {
        if (power == true) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        power = true;
    }

    @Override
    public void setOff() {
        power = false;
    }

    @Override
    public int read() {
        if (power == false) {
            throw new IllegalStateException("Power must be on (true)");
        }
        int number = new Random().nextInt(61)-30;
        return number;
    }
}
