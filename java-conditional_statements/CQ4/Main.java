/******************************************************************************
 characterbased
 	
 
 	
Q4. Java Program to check whether a character is a digit or not

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().toLowerCase().charAt(0);
	    if(a>='0'&&a<='9')
	    {
		System.out.println("Digit");
	    }
	 
	    else{
	        System.out.println("Not a Digit");
	    }
	}
}
