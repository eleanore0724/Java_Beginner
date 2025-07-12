import java.util.concurrent.CountDownLatch;

class Animal implements Runnable {
    private final int number;
    private final CountDownLatch startSignal;
    private final CountDownLatch doneSignal;

    public Animal(int number, CountDownLatch startSignal, CountDownLatch doneSignal) {
        this.number = number;
        this.startSignal = startSignal;
        this.doneSignal = doneSignal;
    }

    public void run() {
        try {
            System.out.println("動物 " + number + " 等待起跑...");
            startSignal.await();

            System.out.println("動物 " + number + " 起跑！");

            Thread.sleep((int)(Math.random() * 3000 + 1000));

            System.out.println("動物 " + number + " 抵達終點！");
            doneSignal.countDown(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}