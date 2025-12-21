/******************************************************************************

Q21.Write a Java program to print a Zig-Zag pattern..

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      
        for(int i=1;i<=n;i++)
        {  int count=1;
            for(int j=1;j<=n;j++)
            {
                if(i==1||i+j==n+1||i==n)
                {
                    System.out.print(count+" ");
                    count++;
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
	}
}
