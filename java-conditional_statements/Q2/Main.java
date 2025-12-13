/******************************************************************************
Q2.Java Program to find smallest among two numbers

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    if(a<b)
	    {
	        System.out.println(a);
	    }
	    else{
		System.out.println(b);
	    }
	}
}
