package OOPS.assignment_3.vehicle;

class Main {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", "none", 2024, 4);
        Bike bike = new Bike("OLA", "electric", 2022, true);
        Lorry lorry = new Lorry("tata", "truck", 2023, 12000);

        car.start();
        car.stop();

        System.out.println(car.toString());

        bike.start();
        bike.stop();
        System.out.println(bike.toString());

        System.out.println(lorry.toString());
    }
}
