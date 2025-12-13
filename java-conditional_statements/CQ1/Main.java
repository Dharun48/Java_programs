/******************************************************************************
 characterbased
 	
Q1. Java Program to check whether a given character is a vowel or consonant

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    char a=s.next().toLowerCase().charAt(0);
	    if((a=='a'||a=='e'||a=='i'||a=='o'||a=='u'))
	    {
		System.out.println("Vowels");
	    }
	    else{
	        System.out.println("Consonant");
	    }
	}
}
