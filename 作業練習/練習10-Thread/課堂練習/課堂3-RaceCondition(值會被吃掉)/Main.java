public class Main{
    //屬共享資源，會被兩個執行緒同時修改。
    private int count = 0;

    public static void main(String[] args){
        var demo = new Main();
        demo.runTest();
    }

    public void runTest(){
        Thread t1 =new Thread(()->{
            for(int i=0;i< 10000;i++){
                count++;
            }
        });

        Thread t2 =new Thread(()->{
            for(int i=0;i< 10000;i++){
                count++;
            }
        });

        t1.start();
        t2.start();

        //
        try{
            t1.join();
            t2.join(); // join=等待兩個執行緒執行完再繼續主程式

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Count "+ count);
    }
}
