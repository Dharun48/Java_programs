/***********************************************************
  
Q5.Write a Java program to print a reverse right angle triangle pattern.

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
               if(j==1||i==1||i+j==n+1)
               {
               System.out.printf("* ");
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