/******************************************************************************
A fitness trainer tracks running distances in meters.
Athletes give distance in kilometers, so the program converts km → meters.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter in KM:");
	    int a=s.nextInt();
		System.out.println("In metre:"+(a*1000));
	}
}
