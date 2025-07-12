public class Main{
    // 建立一個共享的鎖物件，兩個執行緒會「搶這個鎖」
    private final Object lock = new Object();

    public void worker(){
        synchronized(lock){ 
        //只有一個執行緒能同時進入這個區塊，另一個會被「擋在外面」直到鎖被釋放
            System.out.println(
                Thread.currentThread().getName()+"is working");
            while(true);   // 模擬工作無限卡住不釋放鎖
        }
    }

    public static void main(String[] args){
        var demo =new Main();
        Thread t1 =new Thread(demo::worker,"High Priority Thread");
        Thread t2 =new Thread(demo::worker,"Low Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);  //設定執行緒優先權（但實際執行行為不保證）
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
    }
}