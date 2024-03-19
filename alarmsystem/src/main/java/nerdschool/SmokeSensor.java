package nerdschool;

public class SmokeSensor implements Sensor {

  //# Fields
  int triggerCount = 0;
  String location = "Kitchen";
  String sensorType = "SmokeSensor";
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
      this.batteryPercentage -= 20;
    }
  }

  //# Methods
  public boolean isTriggered() {
    this.triggerCount++;

    if (this.triggerCount % 2 == 0) {
      System.out.println("SmokeSensor: ALARM!");
    }

    return true;
  }
}
