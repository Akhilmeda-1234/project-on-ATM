import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 5000;
        
        System.out.println("Welcome to the ATM!");
        System.out.println("Select an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Your balance is: $" + balance);
                break;
                
            case 2:
                System.out.println("Enter the amount to withdraw:");
                int withdrawAmount = input.nextInt();
                
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful!");
                }
                break;
                
            case 3:
                System.out.println("Enter the amount to deposit:");
                int depositAmount = input.nextInt();
                
                balance += depositAmount;
                System.out.println("Deposit successful!");
                break;
                
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
                
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        input.close();
    }
}
