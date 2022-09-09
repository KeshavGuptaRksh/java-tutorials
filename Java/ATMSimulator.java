import java.util.Scanner;

/**
 * ATMSimulator
 */
public class ATMSimulator {
    static Scanner sc = new Scanner(System.in);
    double balance = 200000;
    int PIN = 123456;

    int Welcome_Options() {
        int options = 0;
        System.out.println("Welcome to our ATM");
        System.out.println(
                "Select Operation\n1 Withdraw\n2 Deposit\n3 Check Balance\n4 Generate Green PIN\n5 Reset PIN\n6 Transfer Balance");
        options = sc.nextInt();
        return options;
    }

    void withdrawal() {
        int acc_Type, withdraw_amount, pin;
        System.out.println("Select Account Type\n1 Savings Account\nCurrent Account");
        acc_Type = sc.nextInt();
        switch (acc_Type) {
            case 1:
                System.out.println("Enter Withdrawal Amount");
                withdraw_amount = sc.nextInt();
                System.out.println("Enter ATM PIN");
                pin = sc.nextInt();
                if (pin == PIN) {
                    System.out.println("Please wait while your transaction is processsing...");
                    if (withdraw_amount > balance) {
                        System.out.println("Process Failed Insufficient Balance");
                    } else {
                        System.out.println("Please Collect your cash");
                        balance -= withdraw_amount;
                        System.out.println("Available Balance = " + balance);
                    }
                }
                break;
            case 2:
                System.out.println("Enter Withdrawal Amount");
                withdraw_amount = sc.nextInt();
                System.out.println("Enter ATM PIN");
                pin = sc.nextInt();
                if (pin == PIN) {
                    System.out.println("Please wait while your transaction is processsing...");
                    if (withdraw_amount > balance) {
                        System.out.println("Process Failed Insufficient Balance");
                    } else {
                        System.out.println("Please Collect your cash");
                        balance -= withdraw_amount;
                        System.out.println("Available Balance = " + balance);
                    }
                }
                break;
            default:
                System.out.println("Please Select a valid option");
        }
    }

    public static void main(String[] args) {
        ATMSimulator ob = new ATMSimulator();
        int choice = ob.Welcome_Options();
        switch (choice) {
            case 1:
                ob.withdrawal();
                break;
        }

    }
}