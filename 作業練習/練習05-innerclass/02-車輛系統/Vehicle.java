public class Vehicle {
    private Engine engine;

    public Vehicle() {
        engine = new Engine();
    }

    public void start() {
        System.out.println("車輛啟動中...");
        engine.startEngine();
    }

    public void stop() {
        System.out.println("車輛停止中...");
        engine.stopEngine();
    }

    private class Engine {
        public void startEngine() {
            System.out.println("引擎啟動！");
        }

        public void stopEngine() {
            System.out.println("引擎熄火！");
        }
    }

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.start();
        myCar.stop();
    }
}