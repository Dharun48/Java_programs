/******************************************************************************
 	
Q7.Write a Java Program to Swap of two numbers without using third variable

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    a+=b;
	    b=a-b;
	    a-=b;
	 	System.out.println(a+" "+b);
	}
}
 