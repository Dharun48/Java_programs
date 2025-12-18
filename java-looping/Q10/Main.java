/******************************************************************************
Q10. Write a Java program to find the smallest digit in a given number.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int min=temp%10;
	    temp/=10;
	    
	    while(temp>0)
	    {
	        int min1=temp%10;
	        
	        if(min>min1)
	        {
	            min=min1;
	        }
	        temp/=10;
	    }
	   System.out.println(min);
	        
	   
	    
	}
}
