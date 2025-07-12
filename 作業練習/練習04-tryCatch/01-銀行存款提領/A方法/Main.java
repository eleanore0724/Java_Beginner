import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 1000; // 初始餘額

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("存款金額需大於0");
        balance += amount;
        System.out.println("存款成功，餘額：" + balance);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) throw new InvalidAmountException("提款金額需大於0");
        if (amount > balance) throw new InsufficientBalanceException("餘額不足");
        balance -= amount;
        System.out.println("提款成功，餘額：" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("輸入存款金額：");
            account.deposit(sc.nextDouble());

            System.out.print("輸入提款金額：");
            account.withdraw(sc.nextDouble());

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("錯誤：" + e.getMessage());

        } finally {
            System.out.println("交易完成，最終餘額：" + account.getBalance());
            sc.close();
        }
    }
}