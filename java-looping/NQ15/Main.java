/******************************************************************************
Q15. Write a Java program to check whether a given number is a Perfect Number or not.
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int sum=0;
	    for(int i=1;i<=n/2;i++)
	    {
	        if(n%i==0)
               sum=sum+i;
	    }
	    
	if(n==sum)
	   System.out.println("Perfect no");
	 else 
	    System.out.println("not Perfect no");
	}
}

