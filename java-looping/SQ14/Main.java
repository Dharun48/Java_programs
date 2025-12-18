/****************************************************************************************
Q14. Write a Java program to calculate sum of multiple positive numbers (Stop if user enters negative number).
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N=s.nextInt();   
        int sum=0;
        int count=0;

        while(count<N)
        {
            int num=s.nextInt();

            if (num>0)
            {
                sum+=num;
                count++;
            }
            
        }

        System.out.println(sum);
    }
}



