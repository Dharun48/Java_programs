/******************************************************************************

A person drives at a constant speed.Given the speed (km/hr) and time (hr), 
the program must calculate the distance travelled using: distance = speed × time.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Speed:");
		Double a=s.nextDouble();
		System.out.print("Enter time:");
		Double b=s.nextDouble();
		System.out.printf("Total Distance:"+"%.2f",(a*b));
	}
}