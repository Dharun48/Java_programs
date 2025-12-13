/******************************************************************************
Q13.Write a Java Program to find Surface Area and Volume of a Cuboid
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int l=s.nextInt();
	    int b=s.nextInt();
	    int h=s.nextInt();
		System.out.println("Surface Area:"+(2*(l*b+b*h+l*h))+"\n"+"Volume:"+(l*b*h)+"\n"+"Perimeter:"+(4*(l+b+h)));
	}
}
    