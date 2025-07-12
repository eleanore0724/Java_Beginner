/*
  使用CountDownLatch抹你動物賽跑，建立一個場景讓所有動物在起點線上等待，出發信號後一起起跑
*/

import java.util.concurrent.CountDownLatch;

public class Main{
    public static void main(String[] args) throws InterruptedException{
        int animalCount = 5;
        CountDownLatch startSignal = new CountDownLatch(1); 
        CountDownLatch doneSignal = new CountDownLatch(animalCount); /

        for(int i = 1; i <= animalCount; i++) {
            Animal animal = new Animal(i, startSignal, doneSignal); 
            Thread t = new Thread(animal); 
            t.start(); 
        }
 
        System.out.println("裁判：所有動物就位...");
        Thread.sleep(2000); 

        System.out.println("裁判：預備開始!");
        startSignal.countDown();

        doneSignal.await();
        System.out.println("比賽結束！");
    }
}