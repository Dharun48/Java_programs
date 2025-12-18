/******************************************************************************

Q7. Write a Java program to count the number of 1s and 0s in a binary number.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	   int  a=s.nextInt();
	  int digit=0;
	  int digit1=0;
	  while(a>0)
	  {
	      int temp=a%10;
	      if(temp==0)
	      {
	          digit++;
	      }
	      else
	      {
	          digit1++;
	      }
	      a/=10;
	  }
	       
	      System.out.print("0's:"+digit);
          System.out.print("\n1's:"+digit1);
	       
		
		
	}
}

