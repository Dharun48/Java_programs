/******************************************************************************
Year based
 	
Q5.Write a Java Program to check whether a given year and month combination is valid and
print the number of days in that month (consider leap years for February).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        
        if(n==2&&n1<=29)
        {
            System.out.println("Valid");
        }
         else if(n%2==1&&n1<=31)
        {
            System.out.println("Valid");
        }
        else if(n%2==0&&n1<=30)
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("InValid");
            
        }
    }
}

