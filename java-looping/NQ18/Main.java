/******************************************************************************
Q18. Write a Java program to check whether a given number is a Buzz Number or not.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {

        Scanner s=new Scanner(System.in);
        int n = s.nextInt();

        if (n%7==0||n%10==7)
        {
            System.out.println("Buzz Number");
        } else 
        {
            System.out.println("Not a Buzz Number");
        }
    }
}


