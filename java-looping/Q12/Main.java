/******************************************************************************
Q12. Write a Java program to find the difference between the sum of even digits
and odd digits of a number.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int odd=0;
	    int even=0;
	    while(temp>0)
	    {
	        int a=temp%10;
	        if(a%2==0)
	        {
	            even+=a;
	        }
	        else{
	            odd+=a;
	        }
	        temp/=10;
	    }
	    System.out.println("Differnece:"+(int)Math.abs(even-odd));
	   
	        
	   
	    
	}
}
