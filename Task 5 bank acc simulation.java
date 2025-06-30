import java.util.*;
class Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private List<String> transactions;
  Account(String name, int accNumber) {
        this.accountHolder = name;
        this.accountNumber = accNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account opened for " + name + " with account number " + accNumber);
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactions.add("Deposited: ₹" + amount);
        System.out.println("₹" + amount + " deposited successfully.");
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        transactions.add("Withdrawn: ₹" + amount);
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
    public void viewBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
    public void viewTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple Bank!");
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter a 4-digit account number: ");
        int accNumber = sc.nextInt();
        Account account = new Account(name, accNumber);
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmt = sc.nextDouble();
                    account.deposit(depAmt);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wdAmt = sc.nextDouble();
                    account.withdraw(wdAmt);
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    account.viewTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}