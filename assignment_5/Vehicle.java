class Main{
    // 2. In Vehicle hierarchy, add methods like start and stop in Vehicle and 
    //override them in Child classes.

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        Cycle cycle = new Cycle();

        cycle.start();
        cycle.stop();
        Car car = new Car();
        
        car.start();
        car.stop();
        FourWheeler fourWheeler = new FourWheeler();

        fourWheeler.start();
        fourWheeler.stop();
        TwoWheeler twoWheeler = new TwoWheeler();

        twoWheeler.start();
        twoWheeler.stop();
    }
}
class Vehicle{
    public void start(){
        System.out.println("vehicle is starting");
    }
    public void stop(){
        System.out.println("vehicle is stoping");
    }
}
class TwoWheeler extends Vehicle{
    @Override
    public void start(){
        System.out.println("Two Wheeler is starting");
    }
    @Override
    public void stop(){
        System.out.println("Two Wheeler is stoping");
    }
}
class FourWheeler extends Vehicle{
    @Override
    public void start(){
        System.out.println("Four Wheeler is starting");
    }
    @Override
    public void stop(){
        System.out.println("Four Wheeler is stoping");
    }
}
class Bike extends TwoWheeler{
    @Override
    public void start(){
        System.out.println("Bike is starting");
    }
    @Override
    public void stop(){
        System.out.println("Bike is stoping");
    }
}
class Cycle extends TwoWheeler{
    @Override
    public void start(){
        System.out.println("Cycle is starting");
    }
    @Override
    public void stop(){
        System.out.println("Cycle is stoping");
    }
}

class Car extends FourWheeler{
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    @Override
    public void stop(){
        System.out.println("Car is stoping");
    }
}