/******************************************************************************
Year based
 	
Q2.Java Program to check whether a given year is a century year or not.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        if (n%100==0) {
            System.out.println("Century year");
        } else {
           
            System.out.println("Not a Century Year");
        }
    }
}


