/******************************************************************************

Q9. Write a Java program to calculate sum of even and odd numbers till N.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
       int odd=0;
       int even=0;
       for(int i=1;i<=n;i++)
       { 
           if(i%2==0)
           {
               even+=i;
           }
           else
           {
               odd+=i;
           }
           
       }
       System.out.println(even);
       System.out.println(odd);
    }
}

