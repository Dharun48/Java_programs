/******************************************************************************
Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of Cube
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
		System.out.println("Surface Area:"+(6*(a*a))+"\n"+"Volume:"+(a*a*a)+"\n"+"Perimeter:"+(12*a));
	}
}
