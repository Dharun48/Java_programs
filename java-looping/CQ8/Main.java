/******************************************************************************

Q8. Write a Java program to convert decimal to binary number.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	   int  a=s.nextInt();
	   int binary=0;
	   int place=1;
	   while(a>0)
	   {
	       int rem=a%2;
	       binary=binary+(rem*place);
	       place=place*10;
	       a/=2;
	   }
	      System.out.println(binary); 
		
		
	}
}

