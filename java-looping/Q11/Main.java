/******************************************************************************
Q11. Write a Java program to check whether all digits of a number are even or odd or mixed.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int total=0;
	    int odd=0;
	    int even=0;
	    while(temp>0)
	    {
	        temp/=10;
	        total++;
	    }
	    temp=n;
	    while(temp>0)
	    {
	        int a=temp%10;
	        if(a%2==0)
	        {
	            even++;
	        }
	        else{
	            odd++;
	        }
	        temp/=10;
	    }
	    if(total==even)
	   System.out.println("Even");
	   else if(total==odd)
	   System.out.println("odd");
	   else
	   	   System.out.println("Mixed");
	        
	   
	    
	}
}
