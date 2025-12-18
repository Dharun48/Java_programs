/******************************************************************************
Q14. Write a Java program to check whether a given number is a Strong Number or not.
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
	         int pro=1;
	        int rem=temp%10;
	        for(int i=1;i<=rem;i++)
	        {
	            pro*=i;
	        }
	        sum=sum+pro;
	        temp/=10;
	    }
	  if(n==sum)
	   System.out.println("Strong number");
	   else
	   System.out.println("Not a strong number");
	
}
}
