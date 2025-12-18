/******************************************************************************
Q14. Write a Java program to calculate the sum of squares and cubes of digits of a number.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int a=0;
	    int b=0;
	    int sum;
	    while(temp>0)
	    {
	        int c=temp%10;
	        a=(int)Math.pow(c,2);
	        b=(int)Math.pow(c,3);
	        System.out.println("Sum of "+c+" is "+ (a+b));
	        temp/=10;
	    }
	   
	   
	}
}