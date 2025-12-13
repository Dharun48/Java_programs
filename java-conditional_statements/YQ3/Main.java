/******************************************************************************
Year based
 	
Q3.Java Program to check whether the first two digits and last two digits of a year are equal.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a=n%100;
        int b=n/100;
        if (a==b) {
            System.out.println("Equal");
        } else {
           
            System.out.println("Not Equal");
        }
    }
}

