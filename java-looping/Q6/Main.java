/******************************************************************************

Q6. Write a Java program to check whether the digits of a number are in descending order.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int temp=a;
	    int min1=temp%10;  
	    temp/=10;

	    boolean dscending=true;

	    while(temp>0)
	    {
	        int min=temp%10;
	        if (min<min1) 
	        {  
	            dscending=false;
	            break;
	        }

	        min1=min;     
	        temp/=10;
	    }

	    if (dscending) {
	        System.out.println("Digits are in Dscending order");
	    } else {
	        System.out.println("Digits are not in Dscending order");
	    }
	}
}
