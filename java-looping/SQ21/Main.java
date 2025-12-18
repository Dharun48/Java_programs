/****************************************************************************************
21. Write a Java program to print Fibonacci series up to a given number limit.
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
	    int c=a+b;
	    while(c<=n)
	    {
	       System.out.print(c+" "); 
	       a=b;
	       b=c;
	       c=a+b;
	    }

	}
}





