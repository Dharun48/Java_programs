/******************************************************************************

Q22. Write a Java program to multiply two numbers without using * operator.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int sum=0;
	    for(int i=1;i<=b;i++)
	    {
	        sum=sum+a;
	    }
	   
	   System.out.println(sum);
}
}
