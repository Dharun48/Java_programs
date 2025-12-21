/****************************************************************************
upper right angled triangle hololow
 ************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   int a=65;
	   for(int i=1;i<=n;i++)
	   {
	        int count=0;
	        int num=0;
	       for(int j=1;j<=n;j++)
	       {
	           if(i+j>=n+1)
	           {
	               ++count;
	               if(count%2==1)
	                {
	                   System.out.print(" "+ ++num+" ");
	                   ++num;
	                }
	                else
	                {
	                    System.out.print((char)a);
	                    a++;
	                }
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }
	       --num;
	         for(int j=2;j<=n;j++)
	       {
	           if(i>=j)
	           {
	               ++count;
	               if(count%2==1)
	                {
	                   System.out.print(" "+ --num+" ");
	                   ;
	                   
	                }
	                else
	                {
	                    System.out.print((char)a);
	                    a++;
	                }
	           }
	           else
	           {
	               System.out.print("  ");
	              
	           }
	       }System.out.println();
	       
	       
	       
	}
	
}
}
