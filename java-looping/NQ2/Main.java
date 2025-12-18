/******************************************************************************
number based
                           
Q2. Write a Java program to calculate the sum of digits of a given number.

*******************************************************************************/
import java .util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
while(n>0)
	 {
	     int a=n%10;
	     sum=sum+a;
	     n/=10;
	 }
		System.out.println(sum);
	}
}