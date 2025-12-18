/******************************************************************************

Q13. Write a Java program to calculate sum of multiple positive numbers 
(Stop if user enters negative number).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int sum= 0;
        int n;

    do 
    {
        n = s.nextInt();
         if (n >= 0)
            sum += n;
     } while 
     (n >= 0);

System.out.println(sum);

      
    }
}

