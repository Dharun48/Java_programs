/******************************************************************************

Q19.Write a Java program to print an hour glass pattern.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      
        for(int i=1;i<=n;i++)
        {  char count='A';
            for(int j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1||(i>=j&&i+j>=n+1)||(j>=i&&i+j<=n+1))
                {
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
	}
}
