/******************************************************************************

Q10. Write a Java program to convert a charecter from uppercase to lowercase using ASCII Values.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       char a=s.next().charAt(0);
       int b=(int)a+32;
       if(a=='A'||a=='z')
       System.out.println((char)b);
       else
       System.out.println("Enter correct value");
       
    }
}

