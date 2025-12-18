/****************************************************************************************
Q24. Write a Java program to print all numbers between 1 to N which are power of 2.
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
	        if(i>0&&(i&(i-1))==0)
	        {
	            System.out.print(i+" ");
	        }

	}
  }
}





