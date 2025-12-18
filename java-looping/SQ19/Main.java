/****************************************************************************************
Q19. Write a Java program to print all Perfect numbers between 1 to N.
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        int sum=0;
	        for(int j=1;j<=i/2;j++)
	        {
	           if(i%j==0)
	           {
	               sum+=j;
	           }
	        }
	             if(i==sum)
	            {
	                System.out.print(i+" ");
	            }
	    }

	}
}





