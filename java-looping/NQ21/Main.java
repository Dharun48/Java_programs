/******************************************************************************

Q21. Write a Java program to check whether a given integer is a power of 2 or not.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    if(n>0&&(n&n-1)==0)
	    {
	        System.out.println("power of 2");
	    }
	    else
	    {
	        System.out.println("not a power of 2");
	    }
}
}
