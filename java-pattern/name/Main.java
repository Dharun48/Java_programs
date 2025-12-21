/****************************************************************************
upper right angled triangle hololow
 ************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=n;j++)
	       {
	           if(i==1||j==n||i==n||j==2)
	           {
	               System.out.print("* ");
	           }
	           else
	           {
	               System.out.print("  ");
	           }
	       }System.out.println(" ");
	   }
	   System.out.println(" ");
	  
	    for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=n;j++)
	       {
	           if(j==1||j==n||i==3)
	           {
	               System.out.print("* ");
	           }
	           else
	           {
	               System.out.print("  ");
	           }
	       }System.out.println(" ");
	   }
	    System.out.println(" ");
	  
	    for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=n;j++)
	       {
	           if(j==1||j==n||i==1||i==3)
	           {
	               System.out.print("* ");
	           }
	           else
	           {
	               System.out.print("  ");
	           }
	       }System.out.println(" ");
	   }
	   System.out.println(" ");
	  
	    for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=n;j++)
	       {
	           if(j==1||j==n||i==1||i==3)
	           {
	               System.out.print("* ");
	           }
	           else
	           {
	               System.out.print("  ");
	           }
	       }System.out.println(" ");
	   }
	   System.out.println(" ");
	  
	    for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=n;j++)
	       {
	           if(j==1||i==n||j==n)
	           {
	               System.out.print("* ");
	           }
	           else
	           {
	               System.out.print("  ");
	           }
	       }System.out.println(" ");
	   }
	   System.out.println(" ");
	  
	    for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=n;j++)
	       {
	           if(j==1||i==j||j==n)
	           {
	               System.out.print("* ");
	           }
	           else
	           {
	               System.out.print("  ");
	           }
	       }System.out.println(" ");
	   
	}
	}
}
