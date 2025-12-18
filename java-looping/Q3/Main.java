/******************************************************************************
 
Q3. Write a Java program to check whether the given digit is occurred in a number.

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
		 System.out.println("number occured");
		 break;
		}
			temp/=10;
		}

	
	}
}
