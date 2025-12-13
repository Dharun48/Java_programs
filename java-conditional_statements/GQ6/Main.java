/******************************************************************************
 Geomentrybased
 	
Q6. Write a Java Program to check whether four sides form a square or rectangle.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c =s.nextInt();
	    int d =s.nextInt();
	    if(a==b&&a==c&&a==d)
	    {
		System.out.println("Square");
	    }
	 
	   else if(a==c&&b==d){
	        System.out.println("Rectangle");
	    }
	    else{
	        System.out.println("Enter valid Value");
	    }
	}
}
