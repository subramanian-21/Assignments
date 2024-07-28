package OOPS.assignment_3.vehicle;

class Bike extends Vehicle {
    private final boolean isElectric;

    public Bike(String brand, String model, int year, boolean isElectric) {
        super(brand, model, year);
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Type : Bike\nIs Electric : " + isElectric + "\n" + super.toString();
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

}
