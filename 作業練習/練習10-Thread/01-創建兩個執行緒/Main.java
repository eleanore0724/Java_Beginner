/*
  創建兩個執行緒，一個打印奇數，一個打印偶數，從1~20，確保他們交替打印
*/

public class Main{
   private static int number = 1;
   private static final int MAX = 20;
   private static final Object lock = new Object();

    public static void main(String[] args){
        Thread oddThread = new Thread(()->{
            while(number <= MAX){
                synchronized (lock) {
                   if(number % 2 == 1) {
                       System.out.println("奇數: " + number);
                       number++;
                       lock.notify();
                   }else{
                       try {
                           //wait() 和 sleep() 都會拋出 InterruptedException
                           lock.wait();
                       }catch(InterruptedException e){
                           e.printStackTrace();
                       }
                   }
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while (number <= MAX) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("偶數: " + number);
                        number++;
                        lock.notify(); // 通知對方可以做事
                    } else {
                        try {
                            lock.wait(); // 執行緒進入等待狀態
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

	oddThread.start();
        evenThread.start();
    }
}