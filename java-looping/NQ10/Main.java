/******************************************************************************

Q10. Write a Java program to check whether a given number is prime or not.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
               count++;
        }
	    
	if(count==2)
	   System.out.println("Prime no");
	 else 
	    System.out.println("not Prime no");
	}
}
