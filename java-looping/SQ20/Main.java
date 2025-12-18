/****************************************************************************************
Q20. Write a Java program to print Fibonacci series up to N terms.
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   int a=0;
	   int b=1;
	    System.out.print("0"+" "+"1"+" ");
	    for(int i=3;i<=n;i++)
	    {
	       
	      int c=a+b;
	       System.out.print(c+" "); 
	       a=b;
	       b=c;
	    }

	}
}





