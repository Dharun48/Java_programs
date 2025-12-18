/******************************************************************************

Q12. Write a Java program to print multiplication table of N.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
         int n=s.nextInt();
       
       for(int i=1;i<=10;i++)
       { 
            System.out.println(i+"x"+n+"="+(i));
           
       }
      
      
    }
}

