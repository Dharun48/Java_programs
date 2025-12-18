/******************************************************************************

Q11. Write a Java program to print "Hello World" for N times.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       
       for(int i=1;i<=n;i++)
       { 
            System.out.println("Hello World");
           
       }
      
      
    }
}

