/******************************************************************************
Q9. Write a Java program to find the largest digit in a given number.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int max=temp%10;
	    temp/=10;
	    int max1=0;
	    while(temp>0)
	    {
	        int a=temp%10;
	        
	        if(max<max1)
	        {
	            max=max1;
	        }
	        temp/=10;
	    }
	   System.out.println(max);
	        
	   
	    
	}
}
