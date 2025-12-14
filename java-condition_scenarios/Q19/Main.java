/******************************************************************************
Q19.Write a Java program to display mobile data usage alert – 
"Low Data", "Half consumed", or "Data Over" based on usage.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter The used data in percentage: ");
        int data = s.nextInt();
        if (data<=50) {
            System.out.println("Low data");
        }
            else if(data==100) {
           System.out.println("Data over");
        }
        else {
           System.out.println("Half consumed");
        }

    }
}


