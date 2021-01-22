package application;

import java.util.*;

public class AverageSensor implements Sensor{
    private List<Sensor> sensorList = new ArrayList<>();
    private List<Integer> avgSensor = new ArrayList<>();
    public AverageSensor() {
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }
    @Override
    public boolean isOn() {
        boolean isOn = false;
        if(sensorList.stream().allMatch(i -> i.isOn() == true)) {
            isOn = true;
        }else {
            isOn = false;
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for (Sensor i : sensorList) {
            i.setOn();
        }
    }

    @Override
    public void setOff() {
        sensorList.stream().forEach(i-> i.setOff());
    }

    @Override
    public int read() {
        if(sensorList.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Sensor i : sensorList) {
            sum += i.read();
        }
        int average = sum / sensorList.size();
        avgSensor.add(average);
        return average;
    }

    public List<Integer> readings() {
        return avgSensor;
    }
}
