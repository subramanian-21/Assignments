package OOPS.assignment_3.vehicle;

class Lorry extends Vehicle {
    private int loadCapacity;

    public Lorry(String brand, String model, int year, int loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Type : LOrry\nLoad capacity : " + loadCapacity + "\n" + super.toString();
    }

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}
