/******************************************************************************
 Geomentrybased
 	
Q5. Java Program to check whether three sides form a valid triangle

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c =s.nextInt();
	    if((a+b>c)&&(b+c>a)&&(a+c>c))
	    {
		System.out.println("Valid Triangle");
	    }
	 
	    else{
	        System.out.println(" Not Valid Triangle");
	    }
	}
}
