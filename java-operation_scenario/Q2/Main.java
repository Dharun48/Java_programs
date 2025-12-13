/******************************************************************************
  time in minutes but needs the time in seconds. The program should convert minutes into seconds.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Minutes:");
		int a=s.nextInt();
		System.out.println("Seconds:"+a*60);
	}
}

