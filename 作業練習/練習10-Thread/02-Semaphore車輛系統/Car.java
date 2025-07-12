/*
  定義一台車怎麼行動，進入停車場 → 停車幾秒 → 離開停車場
*/

import java.util.concurrent.*;

public class Car extends Thread{
    
    private final int carNumber;
    private final Semaphore semaphore;

    public Car(int carNumber, Semaphore semaphore){
        this.carNumber = carNumber;
        this.semaphore = semaphore;
    }

    public void run() {
        try{
            System.out.println("車輛" + carNumber + " 嘗試進入停車場...");
            semaphore.acquire();
            System.out.println("車輛" + carNumber + " 成功停入停車場");
            
            Thread.sleep(5000);  //停車時間

            System.out.println("車輛" + carNumber + " 離開停車場");
            semaphore.release();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}