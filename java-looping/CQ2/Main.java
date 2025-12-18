/******************************************************************************

Q2. Write a Java program to print all the English alphabets in lowercase.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    for(int i='a';i<='z';i++)
	    {
            System.out.print((char)i+" ");
	    }
		
	}
}
