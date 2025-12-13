/******************************************************************************
Switch based
 	
Q3.Java Program to check whether the given day number (1–7) is a weekday or weekend

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int a=s.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:    
                System.out.println("WEEKDAY");
                break;
            case 6:
            case 7:    
                System.out.println("WEEKEND");
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}


