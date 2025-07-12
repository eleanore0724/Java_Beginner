import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("請問你是要存款還是提款?");
        String customerSC = sc.nextLine().trim();  //

        if (customerSC.contains("存款")) {   // 使用 equals 比較字串
            try {
                System.out.print("輸入存款金額：");
                account.deposit(sc.nextInt());
            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println("錯誤：" + e.getMessage());
            } finally {
                System.out.println("交易完成，最終餘額：" + account.getBalance());
            }

        } else if (customerSC.contains("提款")) {
            try {
                System.out.print("輸入提款金額：");
                account.withdraw(sc.nextInt());
            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println("錯誤：" + e.getMessage());
            } finally {
                System.out.println("交易完成，最終餘額：" + account.getBalance());
            }

        } else {
            System.out.println("您輸入錯誤");
        }

        sc.close();  // 最終一次關閉
    }
}

// 餘額不足異常
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// 無效金額異常
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance = 1000; // 初始餘額

    public void deposit(int money) throws InvalidAmountException {
        if (money <= 0) throw new InvalidAmountException("存款金額需大於0");
        balance += money;
        System.out.println("存款成功，餘額：" + balance);
    }

    public void withdraw(int money) throws InvalidAmountException, InsufficientBalanceException {
        if (money <= 0) throw new InvalidAmountException("提款金額需大於0");
        if (money > balance) throw new InsufficientBalanceException("餘額不足");
        balance -= money;
        System.out.println("提款成功，餘額：" + balance);
    }

    public int getBalance() {
        return balance;
    }
}