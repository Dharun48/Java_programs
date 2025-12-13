/******************************************************************************
 Geomentrybased
 	
Q4. Java Program to check whether the sum of three angles forms a valid triangle.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int x=s.nextInt();
	    int y=s.nextInt();
	    if(x>0&&y>0)
	    {
		System.out.println("I Quadrant");
	    }
	   else  if(x<0&&y>0)
	    {
		System.out.println("II Quadrant");
	    }
	   else  if(x<0&&y<0)
	    {
		System.out.println("III Quadrant");
	    }
	 
	    else{
	        System.out.println("IV Quadrant");
	    }
	}
}
