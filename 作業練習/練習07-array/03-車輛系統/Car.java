public class Car {
    private int speed = 0;
    private final int maxSpeed = 200;

    public void accelerate() {
        if (speed + 30 <= maxSpeed) {
            speed += 30;
        } else {
            speed = maxSpeed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isMaxSpeed() {
        return speed >= maxSpeed;
    }
}