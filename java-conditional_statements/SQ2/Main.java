/******************************************************************************
Switch based
 	
Q2.Java Program to check grade of a student based on marks (A, B, Java, Fail)

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else {
            grade = 'F'; 
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent! Grade A");
                break;
            case 'B':
                System.out.println("Good! Grade B");
                break;
            case 'C':
                System.out.println("Average! Grade C");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}


