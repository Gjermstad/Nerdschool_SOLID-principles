package nerdschool;

public class FireSensor implements Sensor {

  //# Fields
  int triggerCount = 0;
  String location = "Bedroom";
  String sensorType = "FireSensor";
  double batteryPercentage = 100;

  //# Getters
  public String getLocation() {
    return this.location;
  }

  public String getSensorType() {
    return this.sensorType;
  }

  public double getBatteryPercentage() {
    return this.batteryPercentage;
  }

  //# Setters
  public void setBatteryPercentage() {
    if (this.batteryPercentage == 0) {
      // Nothing happens
    } else {
      this.batteryPercentage -= 10;
    }
  }

  //# Methods
  public boolean isTriggered() {
    this.triggerCount++;

    if (this.triggerCount % 3 == 0) {
      System.out.println("FireSensor: ALARM!");
    }

    return true;
  }
}