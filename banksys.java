import java.util.Scanner;

public class banksys {
    public static void main(String[] args) {
        int password = 1234;
        int balance = 100;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password (or enter 4 to exit): ");
        int userPassword = input.nextInt();

        while (userPassword != password) {
            if (userPassword == 4) {
                System.out.println("Exit successful...");
                input.close();
                return;
            }
            System.out.print("Incorrect password. Try again: ");
            userPassword = input.nextInt();
        }

        System.out.println("Welcome to the bank!");

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = input.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful! New balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = input.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! New balance: " + balance);
                    }
                    break;
                    
                case 3:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Exit successful...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 4);

        input.close();
    }
}
