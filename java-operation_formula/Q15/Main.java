/******************************************************************************
Q15.Write a Java Program to find Surface Area and Volume of a Cylinder
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int r=s.nextInt();
	    int h=s.nextInt();
		System.out.println("Surface Area:"+(2*Math.PI*r*(r+h))+"\n"+"Volume:"+((Math.PI*r*r*h)));
	}
}