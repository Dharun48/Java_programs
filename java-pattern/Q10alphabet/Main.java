/****************************************************************************
Q10.Write a Java program to print a reverse hollow pyramid pattern.
 ************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   
	   for(int i=1;i<=n;i++)
	   {
	        char count='A';
	       for(int j=1;j<=n;j++)
	       {
	           
	           if(i==j||i==1)
	           {
	               System.out.print(count+" ");
	               count++;
	              
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }
	       
	        for(int j=n-1;j>=1;j--)
	       {
	           
	           if(i==1||i==j)
	           {
	               System.out.print(count+" ");
	               count++;
	              
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }System.out.println();
	}
	
}
}
