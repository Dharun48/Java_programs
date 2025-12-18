/******************************************************************************

Q13. Write a Java program to check whether a given integer is a perfect square or not.
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        int root=(int)Math.sqrt(n);

        if (root*root==n) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}

