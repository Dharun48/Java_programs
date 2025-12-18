/******************************************************************************
Q16. Write a Java program to check whether a given number is a Neon Number or not.
*******************************************************************************/
import java.util.Scanner;
public class Main

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square=n*n;
        int sum=0;

        while (square > 0)
        {
            int a= square%10;
            sum=sum+a;
            square/= 10;
        }

        if (sum==n)
        {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}

