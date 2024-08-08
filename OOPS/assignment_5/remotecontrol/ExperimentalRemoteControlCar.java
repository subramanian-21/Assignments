package OOPS.assignment_5.remotecontrol;

public class ExperimentalRemoteControlCar implements RemoteControlCar{
    int count = 0;
    public void drive() {
        count++;
        return;
    }
    public int getDistanceTravelled() {
        return count*20;
    }
}