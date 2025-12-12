import java.util.Scanner;
public class Main{
public static void main (String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.print("Enter your Roll No:");
  int a=s.nextInt();
  System.out.print("Enter your Name:");
  String b=s.next();
  System.out.println("Roll No:"+a+","+"Name:"+b);
}
}