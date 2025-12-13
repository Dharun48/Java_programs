/******************************************************************************
 Geomentrybased
 	
Q1. Java Program to check whether a triangle is equilateral, isosceles, or scalene

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	   int b=s.nextInt();
	    int c=s.nextInt();
	    if(a==b&&a==c&&b==c)
	    {
		System.out.println("Eequilateral");
	    }
	    else if(a!=b||a!=c)
	    {
		System.out.println("isosceles");
	    }
	 
	    else{
	        System.out.println("scalene");
	    }
	}
}
