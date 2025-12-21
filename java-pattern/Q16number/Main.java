/****************************************************************************
Q16.Write a Java program to print a reverse half diamond pattern.
 ************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   
	   for(int i=1;i<=n-1;i++)
	   {
	        int count=1;
	       for(int j=1;j<=n;j++)
	       {
	           
	           if(i>=j)
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
	        for(int i=1;i<=n;i++)
	   {
	        int count=1;
	       for(int j=n;j>0;j--)
	       {
	           
	           if(i<=j)
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
