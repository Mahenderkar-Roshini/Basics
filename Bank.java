import java.util.Scanner;
public class Bank {
    static int CurrentBalance = 1000;
    public static void greetCustomer() {
        System.out.println("Hello,Welcome");
    }
    public void deposite(int amount) {
        CurrentBalance = CurrentBalance + amount;
        System.out.println("Amount Deposite");
    }
    public static void withdraw(int amount) {
        CurrentBalance = CurrentBalance - amount;
        System.out.println("Amount Withdraw");
    }
    public int getCurrentBalance() {
        return CurrentBalance;
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        greetCustomer();
        System.out.println("currentbalance is: " +bank.getCurrentBalance());
        bank.deposite(500);
        System.out.println("currentbalance is: " +bank.getCurrentBalance());
        withdraw(200);
        System.out.println("currentbalance is: " +bank.getCurrentBalance());
    }
}