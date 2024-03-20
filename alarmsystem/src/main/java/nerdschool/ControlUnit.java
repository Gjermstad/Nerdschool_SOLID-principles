package nerdschool;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

  //# Fields
  private final ArrayList<Sensor> sensors;
  private SensorViewer sensorViewer;

  //# Constructor
  public ControlUnit(FireSensor fireSensor, SmokeSensor smokeSensor, SensorViewer sensorViewer) {
    this.sensors = new ArrayList<>();
    this.sensorViewer = sensorViewer;
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

    sensorViewer.displayTriggeredSensors(sensors);
  }
}
