import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your date of birth");
        System.out.print("Date:");
        int a=s.nextInt();
         System.out.print("Month:");
        int b=s.nextInt();
         System.out.print("Year:");
        int c=s.nextInt();
        System.out.println(a+"/"+b+"/"+c);
    }
}