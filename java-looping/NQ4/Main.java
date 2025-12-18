/******************************************************************************
number based
                           
Q4. Write a Java program to print the product of digits of a given number.

*******************************************************************************/
import java .util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int pro=1;
    while(n>0)
	 {
	     int a=n%10;
	     pro*=a;
	     n/=10;
	 }
		System.out.println(pro);
	}
}