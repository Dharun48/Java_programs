/******************************************************************************

Q20.Write a Java Program to print pass/fail result based on marks

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     System.out.println((a>45)?"Pass":"Fail");
    }
}