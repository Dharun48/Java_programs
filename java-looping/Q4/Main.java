/******************************************************************************
 
Q4. Write a Java program to count the occurrence of a digit in a number.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int temp=a;
		int count=0;
		while(temp>0)
		{
		int c=temp%10;
		if(b==c)
		{
		 count++;
		}
		 temp/=10;
		}
		System.out.println(count);
	}
}
