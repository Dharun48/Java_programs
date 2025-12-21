/***********************************************************
 Q1.Write a Java program to print a square pattern.
 *******************************************************/
 import java.util.Scanner;
 public class Main
 {
   public static void main(String[]args)
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int  count=1;
       for(int i=1;i<=n;i++)
      
       {
           for(int j=1;j<=n;j++)
           {
               System.out.printf("%4d",count);
               count++;
           }
           System.out.print(" ");
           System.out.println();
       }
   }
     
 }