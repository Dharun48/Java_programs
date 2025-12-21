/******************************************************************************

23.Write a Java program to print Pascal’s Triangle.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
     
        for(int i=1;i<=n;i++)
        {   int  count=65;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)count+" ");
                count=count*(i-k)/k;
            }
            System.out.println();
        }
	}
}
