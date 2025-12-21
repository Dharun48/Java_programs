/***********************************************************
  
Q4.Write a Java program to print a right angle triangle pattern.

 *******************************************************/
 import java.util.Scanner;
 public class Main
 {
   public static void main(String[]args)
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       char count='A';
       for(int  i=1;i<=n;i++)
      
       {
           for(int j=1;j<=n;j++)
           {
               if(j==1||i==n||i==j)
               {
               System.out.printf(count+ " ");
               count++;
               }
               else
               {
                 System.out.print("  ");  
               }
           }
           System.out.print(" ");
           System.out.println();
       }
   }
     
 }