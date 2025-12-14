/******************************************************************************
Q20.Write a Java program to Javaheck if vehicle speed exceeds 100 km/h.
("Over-speeding! Fine imposed.","Speed iswithin limit")

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Speed of the vehicle: ");
        int a = s.nextInt();
        if (a > 100) {
            System.out.println("Over-speeding! Fine imposed.");
        }
        else {
           System.out.println("Speed is within limit");
        }

    }
}


