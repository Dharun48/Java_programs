/******************************************************************************
 characterbased
 	
Q3. Java Program to check whether a character is alphabet or not

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().toLowerCase().charAt(0);
	    if(a>='a'&&a<='z')
	    {
		System.out.println("Alphabet");
	    }
	 
	    else{
	        System.out.println("Not a Alphabet");
	    }
	}
}
