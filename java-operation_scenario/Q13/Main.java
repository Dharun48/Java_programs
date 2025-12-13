/******************************************************************************
 
A fruit shop has an offer: Buy 3 mangoes and get 1 free. Based on the mango price and total mangoes purchased,
compute total mangoes received and amount to pay.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Mango price:");
	    int a=s.nextInt();
		System.out.print("Total mango's purchased:");
	    int b=s.nextInt();
	    int free=b/3;
	    int c=b+free;
	       System.out.println("Total mangoes received: " +c);
        System.out.println("Total amount to pay: ₹" + a*b);
	}


}
