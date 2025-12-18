/****************************************************************************************
Q22. Write a Java program to print all Buzz numbers between 1 to N.
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
	        if(i%7==0||i%10==7)
	        {
	            System.out.print(i+" ");
	        }

	}
  }
}





