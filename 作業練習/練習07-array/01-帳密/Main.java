import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountSystem system = new AccountSystem();  
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入帳號：");
        String username = scanner.nextLine();

        System.out.print("請輸入密碼：");
        String password = scanner.nextLine();

        if (system.login(username, password)) {
            System.out.println("登入成功！");
        } else {
            System.out.println("帳號或密碼錯誤！");
        }

        scanner.close();
    }
}