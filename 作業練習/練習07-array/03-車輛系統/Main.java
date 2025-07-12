public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("第 " + (i + 1) + " 台車開始加速：");

            while (!cars[i].isMaxSpeed()) {
                cars[i].accelerate();
                System.out.println("目前速度：" + cars[i].getSpeed() + " km/h");
            }

            System.out.println("第 " + (i + 1) + " 台車已達最大速度：" + cars[i].getSpeed() + " km/h");
            System.out.println("--------------------------------");
        }
    }
}