package nerdschool;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

  //# Fields
  private final ArrayList<Sensor> sensors;

  //# Constructor
  public ControlUnit(FireSensor fireSensor, SmokeSensor smokeSensor) {
    this.sensors = new ArrayList<>();
    sensors.add(fireSensor);
    sensors.add(smokeSensor);
  }

  public void pollSensors() {
    List<Sensor> triggeredSensors = new ArrayList<>();

    for (Sensor sensor : sensors) {

      if (sensor.getBatteryPercentage() != 0) {

        if (sensor.isTriggered()) {
          triggeredSensors.add(sensor);
        }

        sensor.setBatteryPercentage();
      }
    }

    if (triggeredSensors.isEmpty()) {
      System.out.println("No sensors were triggered");
    } else {
      for (Sensor sensor: triggeredSensors) {
        System.out.printf("A %s sensor was triggered at %s%n", sensor.getSensorType(), sensor.getLocation());
      }
    }
  }
}
