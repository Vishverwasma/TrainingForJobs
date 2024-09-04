package RailworldTraining.Day18;

public class WireLessMouse {
    private int sensor;
    private int battery;
    private float volts;

    public WireLessMouse() {
    }

    public WireLessMouse(int sensor, int battery, float volts) {
        this.sensor = sensor;
        this.battery = battery;
        this.volts = volts;
    }

    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public float getVolts() {
        return volts;
    }

    public void setVolts(float volts) {
        this.volts = volts;
    }

    @Override
    public String toString() {
        return "WireLessMouse{" +
                "sensor=" + sensor +
                ", battery=" + battery +
                ", volts=" + volts +
                '}';
    }

    public static void main(String[] args) {
        WireLessMouse mouse = new WireLessMouse();
        mouse.setSensor(2);
        mouse.setBattery(4);
        mouse.setVolts(1.5F);
        System.out.println(mouse.toString());
    }
}
