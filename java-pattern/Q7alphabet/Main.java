/***********************************************************
  
Q7.Write a Java program to print a reverse left angle triangle pattern.

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
               if(j==n||i==1||i==j)
               {
               System.out.print(count+ " ");
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