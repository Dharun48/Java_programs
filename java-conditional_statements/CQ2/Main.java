/******************************************************************************
 characterbased
 	
Q2. Java Program to check whether a given character is uppercase, lowercase, digit, or special symbol

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().charAt(0);
	    if(a>='a'&&a<='z')
	    {
		System.out.println("Lower case");
	    }
	     else if(a>='A'&&a<='Z')
	    {
		System.out.println("Upper case");
	    }
	     else if(a>='0'&&a<='9')
	    {
		System.out.println("Digit");
	    }
	    else{
	        System.out.println("Special Symbols");
	    }
	}
}
