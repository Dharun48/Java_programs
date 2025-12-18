/******************************************************************************
Q13. Write a Java program to remove all zeroes from a given number.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int temp=n;
	    int num=0;
	    int place=1;
	    while(temp>0)
	    {
	        int digit=temp%10;
	        if(digit!=0)
	        {
	            num=(digit*place)+num;
	            place=place*10;
	        }
	        temp/=10;
	    }
	    System.out.println(num);
	}
}