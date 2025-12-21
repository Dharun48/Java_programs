/******************************************************************************

Q25.Write a Java program to print a reverse alphabet palindrome pyramid.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n;i++) 
        {
            int count= 0;
            for (int j=1;j<=n;j++)
            {
                if(i+j>=n+1)
                {
                    System.out.print((char)('A'+(n-1-count)));
                    count++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=1;j<=count-1;j++)
            {
                System.out.print((char)('A'+(n-1- --count)));
            }

            System.out.println();
        }
    }
}
