public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model Y");
        car1.accelerate();
        car1.decelerate();
        car1.honk();

        System.out.println();

        Motorcycle moto1 = new Motorcycle("Kymco", "GP 125");
        moto1.accelerate();
        moto1.decelerate();
        moto1.honk();

        System.out.println();

        Truck truck1 = new Truck("Scania", "CF110");
        truck1.accelerate();
        truck1.decelerate();
        truck1.honk();
    }
}


interface VehicleBehavior {
    void accelerate();
    void decelerate();
    void honk();
}


abstract class Vehicle implements VehicleBehavior {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("-----------------------");
        System.out.println("Model=" + model + "\tBrand=" + brand);
    }
}


class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }

    public void accelerate() {
        System.out.println("踩油門 加速");
    }

    public void decelerate() {
        System.out.println("踩煞車 減速");
    }

    public void honk() {
        System.out.println("輕壓喇叭");
    }
}


class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    public void accelerate() {
        System.out.println("轉右手把 加速");
    }

    public void decelerate() {
        System.out.println("往後壓手煞車 減速");
    }

    public void honk() {
        System.out.println("大拇哥按喇叭鈕");
    }
}


class Truck extends Vehicle {
    public Truck(String brand, String model) {
        super(brand, model);
    }

    public void accelerate() {
        System.out.println("踩油門+控制手把 加速");
    }

    public void decelerate() {
        System.out.println("踩煞車+拉煞車手把 減速");
    }

    public void honk() {
        System.out.println("按喇叭鈕");
    }
}