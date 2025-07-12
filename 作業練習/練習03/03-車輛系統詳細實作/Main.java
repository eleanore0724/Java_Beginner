import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
 
	Scanner scanner = new Scanner(System.in);
	System.out.println("控制你的車輛：" + car.brand + " " + car.model);
	System.out.println("請輸入指令：a = 加速，b = 減速，c = 按喇叭，q = 離開");

        while (true) {
            System.out.print("請輸入指令：");
            String input = scanner.next();

        switch (input) {
            case "a":
                car.accelerate();
                break;
            case "b":
                car.decelerate();
                break;
            case "c":
                car.honk();
                break;
            case "q":
                System.out.println("已結束操作。");
                scanner.close();
                return;
            default:
                System.out.println("請輸入 a / b / c / q");
               }
           }
       }
}

class Vehicle {
    public String brand;
    public String model;
    public int speed;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate() {
        speed += 10;
        System.out.println(brand + " " + model + " 加速中，目前速度：" + speed + " km/h");
    }

    public void decelerate() {
        if (speed >= 10) {
            speed -= 10;
        } else {
            speed = 0;
        }
        System.out.println(brand + " " + model + " 減速中，目前速度：" + speed + " km/h");
    }

    public void honk() {
        System.out.println(brand + " " + model + " 巴巴巴");
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void honk() {
        System.out.println(brand + " " + model + " goes beep beep!");
    }
}
