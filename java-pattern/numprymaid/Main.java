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
	        int count=0;
	       for(int j=1;j<=n;j++)
	       {
	           
	           if(i+j>=n+1)
	           {
	               System.out.print( ++count+" ");
	               
	              
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }
	       
	        for(int j=2;j<=n;j++)
	       {
	           
	           if(i>=j)
	           {
	               System.out.print(--count+" ");
	               
	              
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }System.out.println();
	}
	
}
}
