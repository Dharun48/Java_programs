/******************************************************************************
Q20.Java Program to check whether the ASCII value of a character is even or odd.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().charAt(0);
	    int b=(int)a;
	    if(b%2==0)
	    {
		System.out.println("Even");
	    }
	    else
	    {
	        System.out.println("Odd");
	    }
	}
}
