/******************************************************************************
An ATM dispenses money in ₹2000, ₹500, and ₹100 notes. 
For a given amount, calculate the number of each note required (highest denomination first).

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the amount:");
	    int a=s.nextInt();
	    int notes2000 = a/2000;
        a=a%2000;
        int notes500 = a/500;
        a = a%500;
        int notes100 = a/100;
        System.out.println("₹2000 notes: " + notes2000);
        System.out.println("₹500 notes: " + notes500);
        System.out.println("₹100 notes: " + notes100);
	}


}
