/******************************************************************************
Q20. Write a Java program to check whether a given number is a Magic Number or not.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
  
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0)
		{
		    int rem=temp%10;
		    sum+=rem;
		    temp/=10;
		}
		int ex=sum;
		int sum1=0;
		while(ex>0)
		{
		    int rem=ex%10;
		    sum1=(sum1*10)+rem;
		    ex/=10;
		}if((sum*sum1)==n)
		{
		System.out.println(n+" "+"It is a magical number");
		}
		else{
		System.out.println(n+" "+"It is not a magical number");
		}
	
	}
}
