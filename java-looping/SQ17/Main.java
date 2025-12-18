/****************************************************************************************
Q17. Write a Java program to print all Armstrong numbers between 1 to N.
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++)
	    {
		int temp=i;
		int digit=0;
		while(temp>0)
		{
		    temp=temp/10;
		    digit++;
		}
		temp=i;
		int sum=0;
		while(temp>0)
		{
		    int rem=temp%10;
		    int a=(int)Math.pow(rem,digit);
		    sum=sum+a;
		    temp/=10;
		}
		if(i==sum)
		System.out.print(i+" ");

	}
}
}




