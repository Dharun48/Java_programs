/******************************************************************************

Q1. Write a Java program to print all the English alphabets in uppercase.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    for(int i='A';i<='Z';i++)
	    {
            System.out.print((char)i+" ");
	    }
		
	}
}
