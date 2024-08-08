package OOPS.assignment_5.remotecontrol;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    int count = 0;

    private int victories = 0;
    public void drive() {
        count++;
        return;
    }

    public int getDistanceTravelled() {
        return count*10;
    }
    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(car.getNumberOfVictories(), getNumberOfVictories());
    }
}
