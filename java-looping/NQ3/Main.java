/******************************************************************************
number based
                           
Q3. Write a Java program to count the number of digits in a given number.

*******************************************************************************/
import java .util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int count=0;
while(n>0)
	 {
	    
	     count++;
	     n/=10;
	 }
		System.out.println(count);
	}
}