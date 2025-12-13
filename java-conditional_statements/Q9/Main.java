/******************************************************************************

Q9.Java Program to check odd or even using bitwise operator

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    if((a&1)==0)
	    {
		System.out.println("Even");
	    }
	    else
	    {
	        System.out.println("Odd");
	    }
	}
}
