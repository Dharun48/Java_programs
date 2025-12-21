/******************************************************************************

Q22.Write a Java program to print Floyd’s Triangle.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      char count='A';
        for(int i=1;i<=n;i++)
        {  
            for(int j=1;j<=n;j++)
            {
                if(i+j>=n+1)
                {
                    System.out.print(count+" ");
                    count++;
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
	}
}
