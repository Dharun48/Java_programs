/******************************************************************************

Q17.Write a Java Program to check if a number is power of 2 using bitwise AND

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     System.out.println((n>0&&((n & (n-1))==0))?"power of 2":"not power of 2");
    }
}