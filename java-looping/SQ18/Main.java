/****************************************************************************************
Q18. Write a Java program to print all Strong numbers between 1 to N.
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
	        int sum=0;
	        while(temp>0)
	        {
	            int num=temp%10;
	            int fact =1;
	            for(int j=1;j<=num;j++)
	            {
	                fact*=j;
	               
	            }
	           sum+=fact;
	           temp/=10;
	       }
	             if(i==sum)
	            {
	                System.out.print(i+" ");
	            }
	    }

	}
}





