/******************************************************************************

Q5. Write a Java program to print N natural numbers in reverse.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       for(int i=n;i>0;i--)
       { 
           System.out.print(i+" ");
       }
    }
}

