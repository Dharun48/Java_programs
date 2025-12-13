/******************************************************************************
Year based
 	
Q1. Java Program to check whether a year is a leap year or not

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        if ((n%4==0&&n%100!=0)||n%400==0) {
            System.out.println("Leap year");
        } else {
           
            System.out.println("Not a Leap Year");
        }
    }
}


