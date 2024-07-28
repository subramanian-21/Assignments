package OOPS.assignment_3.vehicle;

abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString(){
        return "Brand : "+brand+"\n"+"Model : "+model+"\n"+"Year : "+year+"\n";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();
    public abstract void stop();
}

