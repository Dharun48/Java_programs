/***********************************************************
  
Q6.Write a Java program to print a left angle triangle pattern.

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
               if(j==n||i==n||i+j==n+1)
               {
               System.out.printf(count+" ");
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