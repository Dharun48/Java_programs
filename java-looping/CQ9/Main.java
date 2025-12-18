/******************************************************************************

Q9. Write a Java program to convert binary to decimal number.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int binary=s.nextInt();
        int decimal=0;
        int power=0;

        while (binary>0) {
            int digit=binary%10;
            decimal=decimal(+digit*(int)Math.pow(2, power));
            power++;
            binary=binary/10;
        }
        System.out.println(decimal);
    }
}

