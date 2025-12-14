/******************************************************************************
Q17.Write a Java program to assign different ticket prices based on day of the week (weekday/weekend).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          System.out.println("Ticket price:");
      int a=s.nextInt();
            
            System.out.println("Enter day(1-7):");
       int b=s.nextInt();
        switch (b) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:    
                System.out.println("WEEKDAY");
                System.out.println("price:"+a);
                break;
            case 6:
            case 7:    
                System.out.println("WEEKEND");
                 System.out.println("price:"+(a+200));
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}


