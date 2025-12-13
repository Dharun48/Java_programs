/******************************************************************************
Q14.Write a Java Program to find Surface Area and Volume of a Sphere
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int r=s.nextInt();
		System.out.println("Surface Area:"+(4*Math.PI*(r*r))+"\n"+"Volume:"+(4.0/3.0*(Math.PI*(r*r*r))));
	}
}
    