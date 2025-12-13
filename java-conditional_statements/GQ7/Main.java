/******************************************************************************
 Geomentrybased
 	
7. Java Program to calculate the distance between two points (x1,y1) and (x2,y2).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1=s.nextDouble();
        double y1=s.nextDouble();
        double x2=s.nextDouble();
        double y2=s.nextDouble();
        if (x1==x2&&y1==y2) {
            System.out.println("Distance=0");
        } else {
            double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            System.out.println("Distance ="+distance);
        }
    }
}

}
