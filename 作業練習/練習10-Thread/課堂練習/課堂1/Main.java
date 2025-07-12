public class Main{
    public static void main(String[] args){
        var t1 = new MyThread("T1");
        var t2 = new Thread(new MyRunnable(),"T2");
        t1.start();  // 開一個執行緒印出 Thread T1
        t2.start();  // 開一個執行緒印出 runnable T2
        t1.run();  // 主執行緒自己執行 run()
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        var t = Thread.currentThread(); //currentThread = 目前正在執行的物件
        System.out.println("Thread " + t.getName());
    }
}

class MyRunnable implements Runnable{
    public void run(){
        var t = Thread.currentThread();
        System.out.println("runnable "+ t.getName());
    }
}