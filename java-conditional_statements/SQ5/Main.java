/******************************************************************************
Switch based
 	
Q5.Java Program using switch to implement a mini ATM simulation		
1


*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double balance = 1000; 

        System.out.println("=== MINI ATM ===");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.print("Enter your choice:");
        int choice=s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance"+balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit:$");
                double deposit=s.nextDouble();
                balance+=deposit;
                System.out.println("New Balance:"+balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: $");
                double withdraw=s.nextDouble();
                if (withdraw<=balance) {
                    balance-=withdraw;
                    System.out.println("New Balance"+balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;
            case 4:
                System.out.println("Exiting ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}


