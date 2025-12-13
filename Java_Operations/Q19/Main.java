/******************************************************************************

Q19.Write a Java Program to find the greatest of three numbers.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int c=s.nextInt();
     System.out.println((a>b&&a>c)?a:(b>a&&b>c)?b:c);
    }
}