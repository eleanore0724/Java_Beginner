public class Vehicle {
    private VehicleBrand brand;

    public Vehicle(VehicleBrand brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("車輛品牌是：" + brand);
    }

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(VehicleBrand.TESLA);
        Vehicle car2 = new Vehicle(VehicleBrand.BMW);

        car1.displayBrand();  
        car2.displayBrand();  
    }
}


