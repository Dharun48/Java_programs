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
       char count='A';
       for(char i=1;i<=n;i++)
      
       {
           for(int j=1;j<=n;j++)
           {
               System.out.print(count+ " ");
               count++;
           }
           System.out.print(" ");
           System.out.println();
       }
   }
     
 }