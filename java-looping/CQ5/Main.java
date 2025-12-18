/******************************************************************************

Q5. Write a Java program to print vowels and consonants separately from alphabets

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	 
	  
	    for(int i='A';i<='Z';i++)
	    {
	        if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
	        {
               System.out.print("Vowels:");
               System.out.print((char)i+" ");
	        }
	         else
	        {
               System.out.print("Consonants:");
               System.out.print((char)i+" ");
	        }
		
		
	}
}
}
