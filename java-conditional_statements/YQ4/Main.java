/******************************************************************************
Year based
 	
Q4.Java Program to check whether two given years have the same last digit..

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int n=a%10;
        int n1=b%10;
        if (n==n1) {
            System.out.println("Equal");
        } else {
           
            System.out.println("Not Equal");
        }
    }
}

