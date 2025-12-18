/******************************************************************************
number based
                           
Q7. Write a Java program to check whether a number is Armstrong number or not.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		int temp=n;
		int digit=0;
		while(temp>0)
		{
		    temp=temp/10;
		    digit++;
		}
		temp=n;
		int sum=0;
		while(temp>0)
		{
		    int rem=temp%10;
		    int a=(int)Math.pow(rem,digit);
		    sum=sum+a;
		    temp/=10;
		}
		if(n==sum)
		System.out.println("Armstrong number");
		else{
		    System.out.println("not Armstrong number");
		}
	}
}
