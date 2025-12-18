/******************************************************************************

Q7.Write a Java program to print N odd numbers.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       for(int i=1;i<=n;i++)
       { 
           System.out.print((2*i-1)+" ");
           
       }
    }
}

