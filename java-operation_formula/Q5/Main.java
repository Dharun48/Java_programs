/******************************************************************************
 Q5.Write a Java Program to find the distance between two points
*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
     Scanner s=new Scanner(System.in);
     int x1=s.nextInt();
     int x2=s.nextInt();
     int y1=s.nextInt();
     int y2=s.nextInt();
    
     System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
}