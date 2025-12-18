/******************************************************************************
Q19. Write a Java program to check whether a given number is an Automorphic Number or not.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	   
	    int n=s.nextInt();
	    
	   int a=(int)Math.pow(n,2);
	   int b=a%100;
	    if(n==b)
	    {
	        System.out.println("Automorphic number");
	    }
	    else{
	        System.out.println("Not a automorphic number");
	    }
	  
	   
	}
}

