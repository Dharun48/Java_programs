/******************************************************************************
 Geomentrybased
 	
Q2. Java Program to check whether a triangle is right-angled or not

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	   int b=s.nextInt();
	    int c=s.nextInt();
	    if((c*c)==((a*a)+(b*b)))
	    {
		System.out.println("Right angled triangle");
	    }
	 
	    else{
	        System.out.println("Not Right angled triangle");
	    }
	}
}
