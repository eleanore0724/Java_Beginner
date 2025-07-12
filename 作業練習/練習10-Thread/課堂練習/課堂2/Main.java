/*
  1.建立一個 InheritableThreadLocal<String> 變數 userId
  2.在主執行緒中設定 userId = "User123"
  3.建立三個子執行緒（兩個平台執行緒，一個虛擬執行緒）：
     -第一個有 繼承 InheritableThreadLocal
     -第二個 不繼承
     -第三個是虛擬執行緒，選擇繼承
*/

public class Main{
    public static void main(String[] args) throws Exception{

        //在主執行緒中設定 ThreadLocal 的值為 "User123"
        InheritableThreadLocal<String> userId = new InheritableThreadLocal<>();
        userId.set("User123");

        // 建立平台執行緒，繼承 ThreadLocal 值
        Thread.ofPlatform()
            .inheritInheritableThreadLocals(true) //繼承父執行緒的值
            .start(()->{
                System.out.println("Inheriting Thread Local:" + userId.get());
            });
 
        // 建立平台執行緒，不繼承
        Thread.ofPlatform()
            .inheritInheritableThreadLocals(false) //不繼承、回傳null
            .start(()->{
                System.out.println("Inheriting Thread Local:" + userId.get());
            });

        // 建立虛擬執行緒，繼承
        Thread vThread =Thread.ofVirtual()
        .inheritInheritableThreadLocals(true)
        .unstarted(()->{
            System.out.println("Inheriting Virtual Thread Local:" + userId.get());
        }) ;
        vThread.start();
        vThread.join(); // 等待虛擬執行緒執行完成
    }
}