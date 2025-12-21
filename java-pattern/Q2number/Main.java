/***********************************************************
 Q2.Write a Java program to print a hollow square pattern.
 *******************************************************/
 import java.util.Scanner;
 public class Main
 {
   public static void main(String[]args)
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int count=1;
       for(int  i=1;i<=n;i++)
      
       {
           for(int j=1;j<=n;j++)
           {
               if(i==n||j==n||i==1||j==1)
               {
               System.out.printf("%4d",count);
               count++;
               }
               else
               {
                 System.out.print("    ");  
               }
           }
           System.out.print(" ");
           System.out.println();
       }
   }
     
 }