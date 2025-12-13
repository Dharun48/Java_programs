/******************************************************************************
 A stationery shop offers: Buy 5 pens, pay only for 3. Given price per pen and pens bought, 
 the program calculates how many pens need to be paid for and total cost.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("pen price:");
	    int a=s.nextInt();
		System.out.print("Pen buyed:");
	    int b=s.nextInt();
	    int free=2*(b/5);
	    int c=b-free;
	       System.out.println("Total pens : " +c);
        System.out.println("Total amount to pay: ₹" + c*a);
	}


}
