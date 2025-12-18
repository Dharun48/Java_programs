/******************************************************************************

Q3. Write a Java program to print lowercase English alphabets in reverse order.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    for(int i='z';i>='a';i--)
	    {
            System.out.print((char)i+" ");
	    }
		
	}
}
