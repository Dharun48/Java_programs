/****************************************************************************************
Q26. Write a Java program to print all numbers between 1 to N which are perfect cubes.
*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   for(int i=1;i*i*i<=n;i++)
	    
	 
	        {
	            System.out.print(i*i*i  +" ");
	        }

	
  }
}





