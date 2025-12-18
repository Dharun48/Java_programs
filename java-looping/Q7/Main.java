/******************************************************************************
Q7. Write a Java program to swap the first and last digit of a given number.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int last,first=0;
	    last=n%10;
	    int digit=0;
	    while(temp>0)
	    {
	        temp/=10;
	        digit++;
	    }
	    temp=n;
	    while(temp>=10)
	    {
            temp/=10;
	    }
	    first=temp;
	    int mid=(n%(int)Math.pow(10,digit-1))/10;
	    int fin=last*(int)Math.pow(10,digit-1)+mid*10+first;
	        
	        System.out.println(fin);
	    
	}
}
