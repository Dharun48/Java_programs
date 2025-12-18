/******************************************************************************

Q4. Write a Java program to print English alphabets that lie between two given alphabets.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    char a=s.next().charAt(0);
	    char b=s.next().charAt(0);
	    for(int i=a;i<=b;i++)
	    {
            System.out.print((char)i+" ");
	    }
		
	}
}
