package tddClass;

public class Bike {

    private int speed;
    private int gear;
    private boolean isOff;
    private boolean isOn;
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        gear = 1;
    }

    public void turnOff() {
        isOn = false;
        gear = 0;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void increaseSpeed() {
       if(isOn) speed++;
       if (speed > 20)gear ++;
    }

}
