/******************************************************************************

Q5. Write a Java program to check whether the digits of a number are in ascending order.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int temp=a;
	    int max1=temp%10;  
	    temp/=10;

	    boolean ascending=true;

	    while(temp>0)
	    {
	        int max=temp%10;
	        if (max>max1) 
	        {  
	            ascending=false;
	            break;
	        }

	        max1=max;     
	        temp/=10;
	    }

	    if (ascending) {
	        System.out.println("Digits are in ascending order");
	    } else {
	        System.out.println("Digits are not in ascending order");
	    }
	}
}
