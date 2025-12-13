/******************************************************************************
 
Q5.Java Program to find whether the given number is 3 digit number or not

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
        if ((a>=100&&a<=999)||(a<=-100&&a>=-999))
	    {
	        System.out.println("3 digit");
	    }
	    else{
	   System.out.println("Not a 3 digit");
	}
	}
}

