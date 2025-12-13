/******************************************************************************
Switch based
 	
Q1.Java Program to Arithmetic Calculator using switch case Statements

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("1)+"+"\n"+"2)-"+"\n"+"3)*"+"\n"+"4)/"+"\n"+"5)%");
         int c=s.nextInt();
         switch(c)
         {
         case 1:
             System.out.println(a+b);
             break;
             case 2:
             System.out.println(a-b);
             break;
             case 3:
             System.out.println(a*b);
             break;
             case 4:
             System.out.println(a/b);
             break;
            case 5:
             System.out.println(a%b);
             break;
             default:
             System.out.println("Enter Valid value");
             break;
         }
    }
    }


