/****************************************************************************
Q12.Write a Java program to print a full pyramid pattern.
 ************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   
	   for(int i=1;i<=n;i++)
	   {
	        int count=1;
	       for(int j=1;j<=n;j++)
	       {
	           
	           if(i+j>=n+1)
	           {
	               System.out.print("* ");
	               count++;
	              
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }
	       
	        for(int j=n-1;j>=1;j--)
	       {
	           
	           if(i+j>=n+1)
	           {
	               System.out.print("* ");
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
