import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Car car = new Car();
            cars.add(car);
            System.out.println(cars);

            System.out.println("第 " + (i + 1) + " 台車開始加速：");

            while (!car.isMaxSpeed()) {
                car.accelerate();
                System.out.println("目前速度：" + car.getSpeed() + " km/h");
            }

            System.out.println("第 " + (i + 1) + " 台車已達最大速度：" + car.getSpeed() + " km/h");
            System.out.println("--------------------------------");
        }
    }
}