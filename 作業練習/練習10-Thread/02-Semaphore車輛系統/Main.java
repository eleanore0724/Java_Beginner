/*
  題目:使用Semaphore建立一個停車場，車輛可以進入和離開，車位已滿須等待車位
*/

import java.util.concurrent.*;

public class Main{
    
    private static final int totalSpot =3;
    private static final Semaphore semaphore = new Semaphore(totalSpot);

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Car car = new Car(i, semaphore);
            car.start();

            try{
                Thread.sleep(2000);  //讓目前執行中的執行緒休眠
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}