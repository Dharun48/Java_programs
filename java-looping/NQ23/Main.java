/******************************************************************************

Q23. Write a Java program to find N power of M (Exponentiation) without using predefined function.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int result=1;
	    for(int i=1;i<=b;i++)
	    {
	        result=result*a;
	    }
		System.out.println(result);
	}
}
