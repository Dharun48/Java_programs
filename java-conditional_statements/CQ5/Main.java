/******************************************************************************
 characterbased
 	
Q5. Java Program to check whether two characters are equal or not

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().toLowerCase().charAt(0);
	    char b=s.next().toLowerCase().charAt(0);
	    if(a==b)
	    {
		System.out.println("Equal");
	    }
	 
	    else{
	        System.out.println("Not equal");
	    }
	}
}
